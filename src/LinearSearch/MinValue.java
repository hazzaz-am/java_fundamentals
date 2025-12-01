package LinearSearch;

public class MinValue {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, -1};

        System.out.println(minValue(arr));
    }

    static int minValue(int[] arr) {
        int min = arr[0];

        for (int j : arr) {
            if (j < min) {
                min = j;
            }
        }

        return min;
    }
}