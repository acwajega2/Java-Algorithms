package Algorithms;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Algorithms {

    /***
     *
     * Word Split
     * Have the function WordSplit(strArr) read the array of strings stored in strArr,
     * which will contain 2 elements: the first element will be a sequence of characters,
     * and the second element will be a long string of comma-separated words, in alphabetical order,
     * that represents a dictionary of some arbitrary length.
     * For example: strArr can be: ["hellocat", "apple,bat,cat,goodbye,hello,yellow,why"].
     * Your goal is to determine if the first element in the input can be split into two words,
     * where both words exist in the dictionary that is provided in the second input.
     * In this example, the first element can be split into two words: hello
     * and cat because both of those words are in the dictionary.
     *
     * Your program should return the two words that exist in the dictionary separated by a comma.
     * So for the example above, your program should return hello,cat.
     * There will only be one correct way to split the first element of characters into two words.
     * If there is no way to split string into two words that exist in the dictionary,
     * return the string not possible. The first element itself will never exist in the dictionary as a real word.
     * Examples
     * Input: new String[] {"baseball", "a,all,b,ball,bas,base,cat,code,d,e,quit,z"}
     * Output: base,ball
     * Input: new String[] {"abcgefd", "a,ab,abc,abcg,b,c,dog,e,efd,zzzz"}
     * Output: abcg,efd
     *
     */

    public static void main(String[] args) {
        String[] input = new String[]{"abcgefd", "a,ab,abc,abcg,b,c,dog,e,efd,zzzz"};
        String[] input2 = new String[]{"names 90", "ronah 90", "patricia 90", "names 90", "names 90", "names 90", "names 90", "james 78", "james 87", "names 09"};
        System.out.println(getHighestAverage3(input2));


        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Allan",2000));
        employeeList.add(new Employee("MArk",1200));
        employeeList.add(new Employee("Tom",3400));
        employeeList.add(new Employee("Sarah",6000));
        employeeList.add(new Employee("Francis",500));
        employeeList.add(new Employee("Henry",733));
        System.out.println(getHighestPaid(employeeList).toString());
        System.out.println(getHighestPaidEmployee(employeeList).toString());

    }


    public static Employee getHighestPaidEmployee(List<Employee> employeeList){
        return employeeList.stream().sorted((e1,e2) -> e2.Salary - e1.Salary).collect(Collectors.toList()).get(0);

    }


    public static String getHighestAverage(String[] studentMarks) {
        Map<String, Integer> studentTotalMarks = new HashMap<>();
        Map<String, Integer> studentCount = new HashMap<>();

        Arrays.stream(studentMarks).forEach(studentMark -> {
            String[] marks_array = new String[2];
            marks_array = studentMark.split(" ");
            String st = marks_array[0].trim();
            if (studentTotalMarks.get(st) == null) {
                studentTotalMarks.put(st, Integer.parseInt(marks_array[1]));
                studentCount.put(st, 1);
            } else {
                int currentMark = studentTotalMarks.get(st) + Integer.parseInt(marks_array[1]);
                int count = studentCount.get(st) + 1;

                studentTotalMarks.put(st, currentMark);
                studentCount.put(st, count);
            }
        });

        String currStudent = "";
        int maxAvg = 0;


        studentTotalMarks.forEach((key, value) -> {

        });


        for (Map.Entry<String, Integer> entry : studentTotalMarks.entrySet()) {
            String nm = entry.getKey();
            int sum = entry.getValue();
            int avg = sum / studentCount.get(nm);

            if (avg > maxAvg) {
                maxAvg = avg;
                currStudent = nm;
            }
        }

        return currStudent;
    }


    public static String getHighestAverage3(String[] studentMarks) {
        Map<String, String> studentTotalMarks = new HashMap<>();

        Arrays.stream(studentMarks).forEach(studentMark -> {
            String[] marks_array = new String[2];
            marks_array = studentMark.split(" ");
            String st = marks_array[0].trim();
            if (studentTotalMarks.get(st) == null) {
                studentTotalMarks.put(st, marks_array[1]);

            } else {
                studentTotalMarks.put(st, studentTotalMarks.get(st) + " " + marks_array[1].trim());
            }
        });

        String currStudent = "";
        double maxAvg = 0;

        for (Map.Entry<String, String> entry : studentTotalMarks.entrySet()) {
            String nm = entry.getKey();
            OptionalDouble avg = Arrays.stream(entry.getValue().split(" ")).mapToInt(Integer::parseInt).average();

            if (avg.getAsDouble() > maxAvg) {
                maxAvg = avg.getAsDouble();
                currStudent = nm;
            }
        }

        return currStudent;
    }

    public static String getHighestAverage2(String[] studentMarks) {
        Map<String, String> studentTotalMarks = new HashMap<>();

        Arrays.stream(studentMarks).forEach(studentMark -> {
            String[] marks_array = new String[2];
            marks_array = studentMark.split(" ");
            String st = marks_array[0].trim();
            if (studentTotalMarks.get(st) == null) {
                studentTotalMarks.put(st, marks_array[1]);
            } else {
                studentTotalMarks.put(st, studentTotalMarks.get(st) + " " + marks_array[1].trim());
            }
        });

        String currStudent = "";
        double maxAvg = 0;

        for (Map.Entry<String, String> entry : studentTotalMarks.entrySet()) {
            String nm = entry.getKey();
            AtomicInteger sum = new AtomicInteger();
            int count = entry.getValue().split(" ").length;
            Arrays.stream(entry.getValue().split(" ")).forEach(val -> {
                sum.addAndGet(Integer.parseInt(val));
            });
            int avg = sum.intValue() / count;
            if (avg > maxAvg) {
                maxAvg = avg;
                currStudent = nm;
            }
        }
        return currStudent;
    }



//    public static String splitWords(String[] text_input) {
//        if (text_input.length != 2) {
//            return null;
//        }
//        String main_word = text_input[0];
//        List<String> result = new ArrayList<>();
//        Arrays.stream(text_input[1].split(",")).collect(Collectors.toList()).forEach(word -> {
//            if (main_word.contains(word)) {
//                result.add(word);
//            }
//        });
//        List<String> final_result = result.stream().sorted((s1, s2) -> s2.length() - s1.length()).limit(2).collect(Collectors.toList());
//        return final_result.size() == 2 ? String.join(",", final_result) : "the string not possible";
//    }



    //--------------> Priolity Ques ---------------
//    public static String splitWords(String[] text_input) {
//        if (text_input.length != 2) {
//            return null;
//        }
//
//    }



    //--------> Get highest paid employee --

    public static Employee getHighestPaid(List<Employee> employeeList){
        EmployeeComparator comp = new EmployeeComparator();
        PriorityQueue<Employee> employeePriorityQueue = new PriorityQueue<>(10,comp);
        employeePriorityQueue.addAll(employeeList);
     //   employeePriorityQueue.
        return employeePriorityQueue.poll();
    }



    //----------------> Binary Tree Java ------------------



}


class EmployeeComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.Salary - e2.Salary;
    }
}




class Employee {
    public String name;
    public Integer Salary;

    public Employee(String name, Integer salary) {
        this.name = name;
        Salary = salary;
    }

    @Override
    public String toString() {
        return "Algorithms.Employee{" +
                "name='" + name + '\'' +
                ", Salary=" + Salary +
                '}';
    }


}