package StringAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class LongestSubString {
    public static void main(String[] args) {

        String input = "abcabcbb";

       // System.out.println(Arrays.asList(input.split("")));
        System.out.println(lengthOfSubString(input));

    }





    public static int lengthOfSubString(String input){
        List<String> subString = new ArrayList<>();
         Arrays.asList(input.split("")).forEach(val -> {
             if (!subString.contains(val)) subString.add(val);
         });
         return subString.size();
    }

    public static int lengthofLongSubString(String s) {
        List<String> caracters =  Arrays.asList(s.split(""));
        List<String> subStrings = new ArrayList<>();
        for (String character : caracters) {
            if (!subStrings.contains(character)) {
                subStrings.add(character);
            }
        }
        return subStrings.size();
    }


    public static int lengthOfLongestSubString(String s) {
        int i = 0;
        int j = 0;
        int max = 0;
        HashSet<Character> hashSet = new HashSet<>();

        while (j < s.length()) {
            if (!hashSet.contains(s.charAt(j))) {
                hashSet.add(s.charAt(j));
                j++;
                max = Math.max(hashSet.size(), max);
            } else {
                hashSet.remove(s.charAt(i));
                i++;
            }


        }

        return max;

    }


}
