package Beginner;

import java.util.Scanner;

// Given an Array consisting of integer. return the first value that is repeating in the array. if no value is being repeated, return-1;

public class Firstrepeate {

    //first repeate
    public static int findRepeate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[j];
                }
            }
        }
        return -1;
    }

    //last repeate
    public static int findRepeate1(int[] arr) {
        int lastrepeat = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    lastrepeat = arr[i];
                    continue;
                }
            }
        }
        return lastrepeat;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of arrays: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.print("Enter the "+ n + " Elements: ");
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("First repeating Number: "+findRepeate(arr));
        System.out.println("last repeating Number: "+findRepeate1(arr));
    }
}
