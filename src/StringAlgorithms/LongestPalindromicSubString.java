package StringAlgorithms;

import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
//import apache.commons.logging.*;

public class LongestPalindromicSubString {
    public static void main(String[] args) {
        String str1 = "h";
        String str2 = "h";
        String str3 = new String("h");;

        System.out.println(str1.equals(str3));


    }






    public static String pal(String input){
        char[] inputC=input.toCharArray();
        List<String> res=new ArrayList<>();
        for(int i = 0; i < inputC.length; i++){
            String firstWord=inputC[i]+"";

            for(int j=i+1; j<inputC.length; j++){
                firstWord=firstWord.concat(inputC[j]+"");
                res.add(firstWord);
            }

        }

        String found="";
        int length= 0;
        for(String predicate: res){
            List<String> chars=Arrays.asList(predicate.split(""));
            Collections.reverse(chars);

            if(predicate.equalsIgnoreCase("StringU")){
                if(predicate.length()>length){
                    length=predicate.length();
                    found=predicate;
                }
            }


        }

        System.out.println("Palindrome = "+found);

        System.out.println(res);

        return "";
    }



  
    public static AtomicReference<String> longestPalidrone(String input) {
        List<String> subString = new ArrayList<>();
        String sub = "";

        for (int i = 0; i < input.length(); i++) {
            sub = String.valueOf(input.charAt(i));
            for (int j = i + 1; j < input.length(); j++) {
                sub = sub + input.charAt(j);
                subString.add(sub);
            }
        }

        AtomicReference<String> max_palidrone = new AtomicReference<>("");
        int max = 0;
        subString.forEach(val -> {
            //   String val2 = val;
            List<String> val2 = Arrays.asList(val.split(""));
            Collections.reverse(val2);

            if (val.length() > max && val.equalsIgnoreCase(String.join("", val2))) {
                max_palidrone.set(val);

            }
        });

        return max_palidrone;
    }
}
