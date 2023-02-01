package Hero;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {

    }




    private static List<Student> findStudent(String schoolName, int startYear, int endyear){
        //Arrays.asStream(schoolName.split)
        Map<String,Student> students = new HashMap<String,Student>();
      //  students.entrySet().stream().
        for (Map.Entry<String, Student> entry: students.entrySet()){
            if
            ( entry.getValue().getEducation().stream().filter(education ->
                education.getInstitution().equalsIgnoreCase(schoolName) && education.getFrom() >= startYear && education.getTo() <= endyear
            ).collect(Collectors.toList()).size() > 0 ){
                return (List<Student>) entry.getValue();


            }
        }
        return null;
    }


}
