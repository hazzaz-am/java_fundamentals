package Functions;


import java.util.Scanner;

public class FindMaxMin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int first = in.nextInt();
        int second = in.nextInt();
        int third = in.nextInt();

        int largestNumber = largest(first, second, third);
        int smallestNumber = smallest(first, second, third);

        System.out.println("Largest number: " + largestNumber);
        System.out.println("Smallest number: " + smallestNumber);
    }

    static int largest(int first, int second, int third) {
        int max = first;

        if (second > max) {
            max = second;
        }

        if (third > max) {
            max = third;
        }

        return max;
    }

    static int smallest(int first, int second, int third) {
        int min = first;

        if (second < min) {
            min = second;
        }

        if (third < min) {
            min = third;
        }

        return min;
    }

}
