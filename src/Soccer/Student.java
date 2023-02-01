package Soccer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Student {

    enum SEX{
        MALE,FEMALE
    }
    private String studentName;
    private SEX sex;
    private Integer age;
    private List<String> subjectsOffered;

}
