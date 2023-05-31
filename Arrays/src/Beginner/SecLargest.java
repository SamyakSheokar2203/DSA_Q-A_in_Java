package Beginner;

// Find the second largest element in the given array

import java.util.Scanner;

public class SecLargest {
    public static int findMax(int [] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static int secMax(int[] arr) {
        int max = findMax(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secMax = findMax(arr);
        return secMax;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.print("Enter "+ n +" Elements: ");
        for( int i =0; i < n ; i ++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Second maximum Element: "+secMax(arr));
    }
}
