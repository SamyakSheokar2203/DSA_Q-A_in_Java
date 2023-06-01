package Beginner;

// Given 2 integers a and b. swap the 2 given values using sum and difference method

public class Swap {
    public static void swapSum(int a, int b) {
        System.out.println("a: "+ a + ", b: "+ b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a: "+ a + ", b: "+ b);
    }

    public static void main(String[] args) {
        int a = 9;
        int b = 3;
        swapSum(a,b);
    }
}
