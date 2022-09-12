package JavaStreams;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    enum sex{
        FEMALE,MALE
    };
    private String name;
    private int salary;
    private sex sex;


}
