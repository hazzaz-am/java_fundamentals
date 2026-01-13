package BinarySearch;

public class Bound {
    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 8, 11, 25, 28};
        System.out.println(lowerBound(arr, 7));
        System.out.println(upperBound(arr, 7));
    }

    public static int lowerBound (int[] arr, int target) {
        int start = 0;
        int end = arr.length;
        int ans = -1;

        while(start <= end) {
            int mid =  start + (end - start) / 2;
            if(arr[mid] >= target) {
                ans = mid;
                end = mid -1;
            } else {
                start = mid + 1;
            }
        }

        return  ans;
    }

    public static int upperBound (int[] arr, int target) {
        int start = 0;
        int end = arr.length;
        int ans = -1;

        while(start < end) {
            int mid =  start + (end - start) / 2;
            if(arr[mid] >= target) {
                ans = mid;
                end = mid -1;
            } else {
                start = mid + 1;
            }
        }

        return  ans;
    }
}