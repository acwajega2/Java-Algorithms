package codeChallenge;

import java.util.ArrayList;
import java.util.List;

public class play {


    /*

    0,1,1,2,3,5,8,13

    next number is sum of previous two numbers
    seq of size n return then n numbers of the seq
     */
    public static void main(String[] args) {
        System.out.println(phen_seq(10));
    }


    class Student{
        private String name;
        private Integer age;

        public Student(String name, Integer age){
            this.name = name;
            this.age = age;
        }

        public void sayStudentName(){
            System.out.println("Student Name : "+ name);
        }
    }


    class school extends Student{

        public school(String name, Integer age) {
            super(name, age);
        }


        public int add(Integer a,Integer b){
                return a + b;
        }

        public int add(Integer a,Integer b,Integer c){
            return a + b + c;
        }
        //-------> Declarative
    }

    private static List<Integer> phen_seq(Integer input){
        List<Integer> result = new ArrayList<Integer>();
        if (input < 1){
            return  result;
        } else if (input == 1){
            result.add(0);
            return result;

        } else {
            result.add(0);
            result.add(1);
            //----> 4
            for(int i = 2; i < input; i++ ){
                result.add(result.get(i-1) + result.get(i -2));
            }
            //-----logn4
            return result;
        }

    }
}
