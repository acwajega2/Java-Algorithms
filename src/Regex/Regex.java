package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        String re = "\\w";
        String text = "J";


        Pattern pt = Pattern.compile(re);
        Matcher matcher = pt.matcher(text);

        System.out.println("sss");
        Boolean result = matcher.matches();
        System.out.println(result);
    }
}
