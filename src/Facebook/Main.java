package Facebook;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {


    }

    public static List<Integer> findLongestSubarrayBySum(List<Integer> arr,int sum){
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < arr.size(); i++){
            for (int j = i + 1; j < arr.size() - 1; j++){

            }

        }



        return result;

    }

}







class MainTest{
    static Main main = new Main();

    @Test
    public static void solution() {
        Assert.assertEquals(main.findLongestSubarrayBySum(Arrays.asList(1,2,3,7,5),12), Arrays.asList(2,4));
    }

    public static void main(String[] args) {
        solution();
    }
}