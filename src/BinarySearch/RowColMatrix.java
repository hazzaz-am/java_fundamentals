package BinarySearch;

import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40},
                {12, 22, 32, 42},
                {14, 24, 34, 44},
                {18, 28, 38, 48},
        };
        System.out.println(Arrays.toString(search(arr, 34)));
    }

    public static int[] search(int[][] matrix, int target) {
        int r = 0;
        int c = matrix.length - 1;

        while(r < matrix.length && c >= 0) {
            if(matrix[r][c] == target) {
                return  new int[] {r, c};
            }
            if (matrix[r][c] > target) {
                c--;
            } else {
                r++;
            }
        }

        return new int[] {-1, -1};
    }
}