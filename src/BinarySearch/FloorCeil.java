package BinarySearch;

import java.util.Arrays;

public class FloorCeil {
    public static void main(String[] args) {
            int[] arr = {5, 10, 15, 20, 25, 30};
          System.out.println(Arrays.toString(getFloorAndCeil(arr, 9)));
    }

    public static int[] getFloorAndCeil(int[] nums, int x) {
        int floorIdx = floor(nums, 0, nums.length - 1, x);
        int ceilIdx  = ceil(nums, 0, nums.length - 1, x);

        return new int[]{
                floorIdx == -1 ? -1 : nums[floorIdx],
                ceilIdx  == -1 ? -1 : nums[ceilIdx]
        };
    }

    public static int floor(int[] nums, int start, int end, int target) {
        int a = -1;
        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(nums[mid] <= target) {
                a = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return a;
    }

    public static int ceil(int[] nums, int start, int end, int target) {
        int a = -1;
        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(nums[mid] >= target) {
                a = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return a;
    }
}