package LinearSearch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter target number: ");
        int target = sc.nextInt();
        int[] numbs = {1, 2, 3, 4, 5, 6};
        int result = linearSearch(numbs, target);
        System.out.println(result);
    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (num == target) {
                return i;
            }
        }

        return -1;
    }
}