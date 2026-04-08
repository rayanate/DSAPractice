package Recursion;

public class ReverseString {

    public static void main(String[] args) {
        String str = "hello"; // Example: Reverse "hello"
        System.out.println("Reversed string: " + reverseString(str));
    }

    public static String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}