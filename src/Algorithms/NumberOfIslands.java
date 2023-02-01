package Algorithms;

import java.util.*;

public class NumberOfIslands {
    //---> 1 --> black
    //----> 0 --> White

    /**
     *
     * [{0,0,1},{1,1,0},{0,1,0}]
     * */

    public static void main(String[] args) {
        int[][] grid = new int[][]{{0,0,1},{1,1,0},{0,1,0}};
        System.out.println(numIslands(grid));
    }

    public static int numIslands(int[][] grid){
        if (grid == null || grid.length == 0) return  0;
        int numIslands = 0;
        int rows = grid.length;
        int columns = grid[0].length;
        for (int i = 0; i < rows; i ++){
            for (int j = 0; j < columns; j ++){
                if (grid[i][j] == 1){
                    ++numIslands;
                   callBFS(grid,i,j);
                }
            }
        }
        return numIslands;
    }

    private static void callBFS(int[][] grid, int i, int j) {
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == 0){
            return;
        }
        grid[i][j] = 0;
        callBFS(grid, i+1, j);//----> up
        callBFS(grid, i -1, j);// ---> down
        callBFS(grid, i, j - 1);//------> lefy
        callBFS(grid, i, j + 1); //------> right
    }


}
