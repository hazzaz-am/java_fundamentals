package LinearSearch;

import java.util.Scanner;

public class SearchInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start and end range: ");
        int start = sc.nextInt();
        int end = sc.nextInt();
        int target = 2;
        int[] arr = {1, 2, 3, 4, 5, 5, 6, 3, 4};

        System.out.println(range(arr, target, start, end));
    }


    static int range(int[] arr, int target, int start, int end) {
        for (int i = start; i <= end; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}