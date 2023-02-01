package BinarySearch;

import java.util.Arrays;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        int arr[] = {1,2,5,6,7,8,1,2,5};

        Arrays.sort(arr);
        boolean found = false;
        int l = 0, h = arr.length - 1;
        while (l <= h) {
            int m = (l + h) /2;
            if (arr[m] < 10){
                l = m + 1;
            } else if (arr[m] > 10){
                h = m -1;
            } else {
                //----->
                System.out.println(" 8 found at index "+m);
                found = true;
                break;
            }
            System.out.println("l: "+l+", h :"+h);
        }

        if (found){
            System.out.println("Solution found!");
        } else {
            System.out.println("Solution not found!");
        }

        System.out.println("Revered word [wajega] -->"+reversedString("wajega"));
    }



    static String reversedString(String s){
        String result = "";
        Stack<String> stack = new Stack<String>();
        char[] chars = s.toCharArray();
        Arrays.asList(chars).forEach(val ->stack.push(String.valueOf(val)));
        System.out.println(stack.toString());
        while(!stack.isEmpty()){
            String temp = stack.pop();
            System.out.println(temp);

        }
        return result;
    }
}
