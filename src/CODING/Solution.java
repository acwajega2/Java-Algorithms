package CODING;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;


interface test1{
    String sayHello();
}

interface test2  extends test1{
    String sayHello();

}


class Actions{
    public  String greeting(){
        return "Hello world";
    }
}




public class Solution {





    public static void main(String[] args) {
        int[] nums = new int[]{1,2,4,5,5,6,5,5,6,10,25,26,2};
        //---> Expected [2,5,6]

        //--? Map<key,value> --> key --> num, --> val --> number of times
        //---> print out numb where the number of times > 1

        Map<Integer, Integer> result= new HashMap<>();


      //  List<Integer> result2 =Arrays.stream(nums).filter(val -> {}).collect(Collectors.toList());


        for (int i = 0; i < nums.length; i++) {
            //---> insert the key into the Map
            if (!result.containsKey(nums[i])){
                result.put(nums[i],1);
            }
            else {
                result.put(nums[i],result.get(nums[i])+1);
            }

        }











    }
}
