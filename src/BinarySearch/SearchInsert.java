package BinarySearch;

public class SearchInsert {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 5, 7};
        System.out.println(searchInsert(arr, 6));
    }
    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int ans = nums.length;

        while(start <= end) {
            int mid = start + (end - start) /2;

            if(nums[mid] >= target) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return ans;
    }
}