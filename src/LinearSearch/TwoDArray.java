package LinearSearch;

import java.util.Arrays;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 32, 12, 3},
                {34, 54, 2, 5},
                {45, 56},
                {65, 423}
        };

        int target = 23;

        System.out.println(Arrays.toString(findTarget(arr, target)));
    }

    static int[] findTarget(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }

        return new int[]{-1};
    }
}