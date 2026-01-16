package BinarySearch;

import java.util.Arrays;

public class FirstAndLast {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int start = 0;
        int end = nums.length - 1;

        System.out.println(Arrays.toString(result(nums, start, end, 8)));

    }

    public static int[] result (int[] arr, int start, int end, int target) {
        int fIdx = firstIndex(arr, start, end, target);

        if (fIdx == -1) return new int[]{-1, -1};

        int lIdx = lastIndex(arr, start, end, target);

        return  new int[] {fIdx, lIdx};
    }

    public static int firstIndex(int[] arr, int start, int end, int target) {
        int idx = -1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] == target) {
                idx = mid;
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid  + 1;
            } else {
                end = mid - 1;
            }
        }

        return idx;
    }

    public static int lastIndex(int[] arr, int start, int end, int target) {
        int idx = -1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] == target) {
                idx = mid;
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return idx;
    }
}