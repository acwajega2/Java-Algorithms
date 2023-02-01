package Soccer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static Soccer.Student.SEX.*;


public class Play {



    public static void main(String[] args) {


        List<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student("Allan Wajega", MALE, 17, Arrays.asList("English","Math","Art")));
        studentList.add(new Student("Martha Akol", FEMALE, 12,Arrays.asList("Geo","Math","Art")));
        studentList.add(new Student("Fred Kamukama", MALE, 11,Arrays.asList("English","Chem","Art")));
        studentList.add(new Student("David Mukasa", MALE, 14,Arrays.asList("English","Math","Bio")));
        studentList.add(new Student("Albert Kisakye", MALE, 8,Arrays.asList("Chem","Math","Art")));
        studentList.add(new Student("Cissy Nabakooza", FEMALE, 14,Arrays.asList("English","Math","Art")));
        studentList.add(new Student("Alex Seruma", MALE, 9,Arrays.asList("Bio","Math","Art")));
        studentList.add(new Student("Praise Nalukwago", FEMALE, 9,Arrays.asList("English","Geo","Art")));
        studentList.add(new Student("Ritah Mbabazi", FEMALE, 13,Arrays.asList("Chem","Math","Art")));
        studentList.add(new Student("Keneth Jingo", MALE, 15,Arrays.asList("Bio","Chem","Art")));


        //-----> List all Male Students
        List<String> maleStudents = studentList.stream().filter(student -> student.getSex() == MALE).map(Student::getStudentName).collect(Collectors.toList());

        System.out.println("MALE STUDENTS ---> "+maleStudents);



        //-----> List all Male Students
        List<String> femaleStudents = studentList.stream().filter(student -> student.getSex() == FEMALE).map(Student::getStudentName).collect(Collectors.toList());

        System.out.println("FEMALE STUDENTS"+femaleStudents);


        //-----------get Average Age of all Students
        System.out.println("AVERAGE STUDENT AGE:- "+studentList.stream().map(Student::getAge).mapToInt(Integer::intValue).average());


        //--------------AVERAGE AGE OF FEMALE STUDENTS
        System.out.println("AVERAGE AGE OF FEMALE STUDENTS:- "+studentList.stream().filter(student ->student.getSex() == FEMALE).map(Student::getAge).mapToInt(Integer::intValue).average());



        //--------------AVERAGE AGE OF MALE STUDENTS
        System.out.println("AVERAGE AGE OF MALE STUDENTS:- "+studentList.stream().filter(student ->student.getSex() == MALE).map(Student::getAge).mapToInt(Integer::intValue).average());



        //-----------> Get Oldest Student-------
        System.out.println("OLDEST STUDENT: -> "+studentList.stream().sorted((s1,s2) -> s2.getAge() - s1.getAge()).collect(Collectors.toList()).get(0));



        //-----------> Get Youngest Student-------
        System.out.println("YOUNGEST STUDENT: -> "+studentList.stream().sorted(Comparator.comparingInt(Student::getAge)).collect(Collectors.toList()).get(0));



        //-------------> Get youngest male Student
        System.out.println("YOUNGEST MALE STUDENT: -> "+studentList.stream().filter(student -> student.getSex() == MALE).sorted(Comparator.comparingInt(Student::getAge)).collect(Collectors.toList()).get(0));








        //----------> List all subjects offered from the
        System.out.println(studentList.stream().map(Student::getSubjectsOffered).collect(Collectors.toList()));


        //----> using flat map --> one to many

        System.out.println(studentList.stream().flatMap(student -> student.getSubjectsOffered().stream()).collect(Collectors.toList()));



        //-----------> Using reducrr

        System.out.println(studentList.stream().map(Student::getAge).reduce(0, Integer::sum
        ));




    }

}
