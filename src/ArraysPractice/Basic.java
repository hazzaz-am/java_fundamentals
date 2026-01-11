package ArraysPractice;

import java.util.Arrays;
import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] rollNumbers = new int[10];
        for (int i = 0; i < rollNumbers.length; i++) {
            rollNumbers[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(rollNumbers));

        int[] classes = {1, 2, 3, 4};

        System.out.println(Arrays.toString(classes));
        int[][] namesLetter = new int[4][3];
        System.out.println(Arrays.toString(namesLetter));
        for (int row = 0; row < namesLetter.length; row++) {
            for (int col = 0; col < namesLetter[row].length; col++) {
                namesLetter[row][col] = in.nextInt();
            }
        }

        for (int[] ints : namesLetter) {
            System.out.println(Arrays.toString(ints));
        }

        int[][] years = {
                {2022, 2021, 2020, 2019, 2018},
                {1999, 1998, 1997, 1996}
        };

        System.out.println(Arrays.toString(years));
    }
}