package Recursion;

public class SumOfDigits {

    public static void main(String[] args) {
        int num = 1234; // Example: Find sum of digits of 1234
        System.out.println("Sum of digits of " + num + " is: " + sumOfDigits(num));
    }

    public static int sumOfDigits(int num) {
        if (num == 0) {
            return 0;
        }
        return (num % 10) + sumOfDigits(num / 10);
    }
}
