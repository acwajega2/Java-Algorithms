package Soccer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static Soccer.Student.SEX.FEMALE;

public class Solution {


    private static StudentDatabase studentDatabase = new StudentDatabase();


    public Solution(StudentDatabase studentDatabase) {
        this.studentDatabase = studentDatabase;
    }

    public static void main(String[] args) {
        List<Student> studentList = studentDatabase.listAllStudents();
        List<Student> femaleStudentsWithDoubleAge = new ArrayList<>();


        femaleStudentsWithDoubleAge = studentList.stream().filter(Solution::filterFemailStudents).map(
                Solution::doubleStudentAge
        ).collect(Collectors.toList());

        System.out.println(femaleStudentsWithDoubleAge);


        System.out.println(studentList);


        //-----------> Get Female Students that offer both English and Math and their age is even greater


        System.out.println("FEMALE STUDENTS WITH EVEN AGE OFFERING BOTH ENGLISH AND MATH: --->"+studentList.stream()
                .filter(fileterFemaleStudents())
                .filter(ageIsEven())
                .filter(offersBothEnglishAndMath())
                .collect(Collectors.toList())
        );

        //---------------> get





    }

    private static Predicate<? super Student> offersBothEnglishAndMath() {
        return student -> new HashSet<>(student.getSubjectsOffered()).containsAll(Arrays.asList("Math","English"));
    }

    private static Predicate<? super Student> ageIsEven() {
        return student -> student.getAge() % 2 == 0;
    }

    private static Predicate<Student> fileterFemaleStudents() {
        return student -> student.getSex() == FEMALE;
    }

    private static boolean filterFemailStudents(Student student) {
        return student.getSex() == FEMALE;
    }


    private static List<StudentDto> listAllStudentsFromDto(List<Student> studentList) {

        return studentList.stream().map(Solution::toDto
        ).collect(Collectors.toList());
    }


    private static StudentDto toDto(Student student) {

        StudentDto dto = new StudentDto();
        dto.setName(student.getStudentName());
        dto.setSex(student.getSex());
        dto.setAge(student.getAge());
        dto.setIsActive(true);

        return dto;
    }

    private static Student doubleStudentAge(Student student) {
        student.setAge(student.getAge() * 2);
        return student;
    }


}
