package JavaStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


import static JavaStreams.Employee.sex.MALE;
import static JavaStreams.Employee.sex.FEMALE;
import static java.util.stream.Collectors.toMap;

public class Main {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("Allan",30000, MALE));
        employeeList.add(new Employee("Mark",12000,MALE));
        employeeList.add(new Employee("Sam",60000,MALE));
        employeeList.add(new Employee("Jane",7000,FEMALE));
        employeeList.add(new Employee("Rose",15000,FEMALE));
        employeeList.add(new Employee("Jude",84000,MALE));
        employeeList.add(new Employee("Resty",7000,FEMALE));
        employeeList.add(new Employee("Albert",21000,MALE));
        employeeList.add(new Employee("Zack",30000,MALE));


        //---------> Get All Female employees
        System.out.println("All Female employees"+employeeList.stream().filter(employee -> employee.getSex() ==FEMALE).collect(Collectors.toList()));

        //--------> get the average number of female employees
        System.out.println("Average Salary of All Female employees: -->"+employeeList.stream().filter(employee -> employee.getSex() ==FEMALE).mapToInt(Employee::getSalary).average().getAsDouble());



        //-------------Convert List Objects to Map ----

        System.out.println(employeeList.stream().collect(toMap(employee -> employee.getName(),employee -> employee.getSalary())));

        //------------------> List of Employee with salary
        System.out.println(employeeList.stream().filter(employee -> employee.getSalary() > 10000).map(Employee::getName) .map(String::toUpperCase));



    }







}
