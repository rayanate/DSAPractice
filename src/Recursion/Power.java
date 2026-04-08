package Recursion;

public class Power {

    public static void main(String[] args) {
        int x = 2, n = 5; // Example: 2^5
        System.out.println(x + " raised to the power " + n + " is: " + power(x, n));
    }

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * power(x, n - 1);
    }
}