package JinkIO.dto;

public class Student {
    private String name;
    private int age;
    private SEX sex;

    public Student(String name, int age, SEX sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setSex(SEX sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public SEX getSex() {
        return sex;
    }

    public String getName() {
        return name;
    }
}

enum SEX {
    MALE,FEMALE
}
