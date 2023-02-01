package Soccer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static Soccer.Student.SEX.FEMALE;
import static Soccer.Student.SEX.MALE;

public class StudentDatabase {
    public List<Student> listAllStudents(){
        List<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student("Allan Wajega", MALE, 17, Arrays.asList("English","Math","Art")));
        studentList.add(new Student("Martha Akol", FEMALE, 12,Arrays.asList("English","Math","Art")));
        studentList.add(new Student("Fred Kamukama", MALE, 11,Arrays.asList("English","Chem","Art")));
        studentList.add(new Student("David Mukasa", MALE, 14,Arrays.asList("English","Math","Bio")));
        studentList.add(new Student("Albert Kisakye", MALE, 8,Arrays.asList("Chem","Math","Art")));
        studentList.add(new Student("Cissy Nabakooza", FEMALE, 14,Arrays.asList("English","Math","Art")));
        studentList.add(new Student("Alex Seruma", MALE, 9,Arrays.asList("Bio","Math","Art")));
        studentList.add(new Student("Praise Nalukwago", FEMALE, 9,Arrays.asList("English","Geo","Art")));
        studentList.add(new Student("Ritah Mbabazi", FEMALE, 13,Arrays.asList("Chem","Math","Art")));
        studentList.add(new Student("Keneth Jingo", MALE, 15,Arrays.asList("Bio","Chem","Art")));

        return studentList;
    }
}
