import java.util.*;
import java.util.stream.Collectors;

public class Optimus {
    public static void main(String[] args) {
        LinkedList<Integer> values = new LinkedList<Integer>();


        values.add(20);
        values.add(30);
        values.add(70);
        values.add(34);
        values.add(19);
        values.add(60);
        values.add(80);

        Collections.sort(values);

        int min_val = values.getFirst();
        int max_val = values.getLast();


        System.out.println("Min Val: ->" + min_val);
        System.out.println("Max Val: ->" + max_val);

        int[][] boardMatrix = {{1, 2, 3, 4}, {5, 6, 7, 8}};

//        for (int[] matrix : boardMatrix) {
//            for (int i : matrix) {
//                System.out.println(i);
//
//            }
//
//        }


        List<Integer> test = new ArrayList<>();
        test.add(5);
        test.add(10);
        test.add(8);
        test.add(7);
        test.add(6);
        test.add(5);


        List result = test.stream().filter(x -> x > 7).sorted().collect(Collectors.toList());

        System.out.println(result);


        String xmen = "THis is us now!";
        List<String> resultsss = Arrays.stream(xmen.split(" ")).map(x -> x.toUpperCase()).collect(Collectors.toList());
        System.out.println(resultsss);


        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Wajega", "0775212088", 30));
        studentList.add(new Student("Joseph", "0775212788", 13));
        studentList.add(new Student("Mark", "0779210088", 18));
        studentList.add(new Student("Sylvia", "0775212088", 90));


        studentList.stream().filter(student -> student.getUsername().startsWith("Wa")).forEach(student -> System.out.println(student.getMobileNumber()));

        System.out.println(studentList.stream().mapToInt(Student::getAge).average());


        System.out.println("Students with even age");
        studentList.stream().filter(x -> x.getAge() % 2 == 0).forEach(x -> System.out.println(x.getUsername()));
        System.out.println("Number of students with even age");
        int even_counts = studentList.stream().mapToInt(m -> {
            int even_count = 0;
            if (m.getAge() % 2 == 0) even_count = 1;
            return even_count;

        }).sum();

        System.out.println(even_counts);

        String sentence_ = "Longest word in Sentence: 'what do you think are the conquences of not understanding the ddgsgssg";
        String sentence_2 = "Longest word in Sentence: 'what do you think are the conquences conquences conquences of not understanding the ddgsgssg";

        // System.out.println("Longest word in Sentence: "+sentence_);

        int max_length = 0;
        String longest_word = "";

        for (String val : sentence_.split(" ")) {

            max_length = Math.max(val.length(), max_length);
            longest_word = val.length() >= max_length ? val : longest_word;


        }

        System.out.println("Longest Word: " + longest_word + " Longest Count:" + max_length);

        System.out.println(Arrays.stream(sentence_.split(" ")).sorted((s1,s2) -> s2.length() - s1.length()).collect(Collectors.toList()).get(0));


      //  System.out.println(Arrays.stream(sentence_2.split(" ")).filter(x -> x.equalsIgnoreCase("conquences")).collect(Collectors.toList()).);

    }


//    public void work_on_data(){
//
//        List<Student> studentList = new ArrayList<>();
//        studentList.add(new Student("Wajega", "0775212088"));
//        studentList.add(new Student("Joseph", "0775212788"));
//        studentList.add(new Student("Mark", "0779210088"));
//        studentList.add(new Student("Sylvia", "0775212088"));
//
//
//        System.out.println(studentList);
//    }


    private static class Student {


        private String username;
        private String mobileNumber;

        private Integer age;


        private Student(String username, String mobileNumber, Integer age) {
            this.mobileNumber = mobileNumber;
            this.username = username;
            this.age = age;
        }

        public String getUsername() {
            return username;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getMobileNumber() {
            return mobileNumber;
        }

        public void setMobileNumber(String mobileNumber) {
            this.mobileNumber = mobileNumber;
        }


    }


}
