package Streams;

import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class StreamsMain {


    public static void main(String[] args) throws FileNotFoundException, URISyntaxException {
       FileReader fileReader = new FileReader("C:\\Users\\wajegaa\\IdeaProjects\\JavaOptimus\\src\\Streams\\sample.txt");

      //  System.out.println(longestWord(fileReader));
        getLines(fileReader);
    }



    public static void getLines(FileReader fileReader){
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String longestLine = bufferedReader.lines().sorted((l1,l2) -> l2.length() - l1.length()).collect(Collectors.toList()).get(0);
       // int maxLength = bufferedReader.lines().mapToInt(String::length).max().getAsInt();

         //   System.out.println(maxLength);


        System.out.println(longestLine);
    }


}


