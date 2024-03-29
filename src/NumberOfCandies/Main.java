package NumberOfCandies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
//        ArrayList<Integer> numbers = new ArrayList<Integer>();
//        numbers.add(1);
//        numbers.add(-3);
//        numbers.add(6);
//        numbers.add(90);
//        numbers.add(1);
//        numbers.add(3);
//        numbers.add(1);
//        numbers.add(10);
//        numbers.add(0);
//        numbers.add(0);
//
//        System.out.println(max_candy(numbers));


            /***
             * We are provided with a junk String, we need to perform the following task
             *
             * 1. Get all email addresses
             * 2. Get All Zip codes
             * 3. Get All Valid phone numbers
             * 4. Get the Shortest word
             * 6. Get the longest_word
             * 7. Change all words to upper case
             * 8. Change all words to lower case
             * 9. Search for a certain phrase
             *
             *
             */


        String junkString ="chris wajeha  Ruke chris@gmail.com 0772123017 +in256 245 red";

        System.out.println("Display only words");
        System.out.println(performRegex("[a-zA-Z]\\S+",junkString));



        System.out.println("Display only NUMBERS");
        System.out.println(performRegex("\\s+\\+[0-9]{3}+",junkString));

        System.out.println("Display only Email Addreses");
        System.out.println(performRegex("[A-Za-z0-9._%]+@[A-Za-z0-9._]+\\.[A-Za-z]{2,4}",junkString));


    }

    public static List<String> performRegex(String reg,String str2Check){
        List<String> result = new ArrayList<String>();
        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(str2Check);

        while (matcher.find()){
            if (matcher.group().length() !=0){
                result.add(matcher.group().trim());
            }
        }


        return result;

    }

    public static int max_candy(ArrayList<Integer> numbers) {
//        if (numbers == null) return 0;
        List<Integer> candy = new ArrayList<Integer>();
        for (int i = 0; i < numbers.size(); i++) {
            int max_neigh = max_neigh(numbers, i);
            if (numbers.get(i) > 0) {
                if (max_neigh >= 0) {
                    candy.add(i);
                } else {
                    candy.add(max_neigh + 1);
                }
            } else {
                candy.add(1);
            }


        }
        return candy.stream().mapToInt(Integer::intValue).sum();
    }

    public static int max_neigh(ArrayList<Integer> numbers, int curr_index) {
        int neighBour = 0;
        if (curr_index - 1 < 0) {
            //---> we consider the number to the right
            neighBour = numbers.get(curr_index + 1);
            if (numbers.get(curr_index) > neighBour) {
                return neighBour + 1;
            } else {
                return numbers.get(curr_index);
            }
        } else if (curr_index + 1 > numbers.size() - 1) {
            //-----------> we consider the number to the left
            neighBour = numbers.get(curr_index - 1);
            if (numbers.get(curr_index) > neighBour) {
                return neighBour + 1;
            } else {
                return numbers.get(curr_index);
            }

        } else {
            //-------------we are in the middle of the list
            int left_value = numbers.get(curr_index - 1);
            int right_value = numbers.get(curr_index + 1);


            if (left_value > right_value) {
                //------> we consider the left

                if (numbers.get(curr_index) > left_value) {
                    return left_value + 1;
                } else {
                    return numbers.get(curr_index);
                }

            } else if (right_value > left_value) {
                //---------> we consider the right
                if (numbers.get(curr_index) > right_value) {
                    return right_value + 1;
                } else {
                    return numbers.get(curr_index);
                }
            }


        }

        return 0;
    }

    public static int candy(ArrayList<Integer> A) {
        int length = A.size();

        List<Integer> candies = new ArrayList<>();
        for (int i = 0; i < A.size(); i++) {

            if (i == 0) {
                candies.add(1);
            } else {

                int prev_val = A.get(i - 1);
                int curr_val = A.get(i);
                int next_val = i == length ? A.get(i) : A.get(i - 1);
                int val = 1;

                if (curr_val > prev_val) {
                    val = prev_val + 1;
                    //add to candies
                }

                if (curr_val > next_val) {
                    val = val + 1;
                    //add to cndies
                }

                if (curr_val < prev_val) {
                    prev_val += 1;
                    val = 1;//update previous value
                }

                if (curr_val < next_val) {
                    prev_val += 1;
                    curr_val = val = 1;
                    next_val = curr_val + 1;
                    //add to candies
                }

                System.out.println("Current index : " + i + " Previous index : " + (i - 1) + " : " + candies);
                int previousIndex = i - 1;

                candies.add(val);
                candies.set(previousIndex, prev_val);
            }
        }


        return candies.stream().mapToInt(Integer::intValue).sum();

    }
}
