package Algorithms;

import java.util.Arrays;

public class SimpleRecursion {

    public static void main(String[] args) {
        int[][] arr = {{0, 1, 1, 1}, {0, 0, 1, 0}, {1, 0, 1, 1},{1, 0, 1, 1}};
       // char[][] arr = {{"0", "1", "1", "1"}, {"0", "0", "1", "0"}, {"1", "0", "1", 1}};


       // Arrays.stream(arr).forEach(System.out::println);
     //   System.out.println(Arrays.deepToString(arr));

        System.out.println(countNumOfIslands(arr));
    }


    public static int countNumOfIslands(int[][] data) {
        if (data == null || data.length == 0) return 0;
        int count = 0;
        int row = data.length;
        int column = data[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (data[i][j] == 1) {
                    ++count;
                  //
                      callBfs(data, i, j);
                   // System.out.println(data[i][j]);
                }
            }
        }

        return count;
    }

    private static void callBfs(int[][] data, int i, int j) {
        if (i < 0 || i >= data.length || j < 0 || j >= data[i].length || data[i][j] == 0) {
            return;
        }
        data[i][j] = 0;
        callBfs(data, i + 1, j); //--------> top
        callBfs(data, i - 1, j); //---------> Bottom
        callBfs(data, i, j - 1);//-----------> left
        callBfs(data, i, j + 1);//------------> right

    }
}
