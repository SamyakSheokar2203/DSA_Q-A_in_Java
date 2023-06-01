package Beginner;

// Find the second smallest element in the given array

import java.util.Scanner;

public class SecSmallest {
    public static int findMin(int [] arr) {
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }
        return minValue;
    }

    public static int secMin(int[] arr) {
        int min = findMin(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) {
                arr[i] = Integer.MAX_VALUE;
            }
        }
        return findMin(arr);
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
        System.out.println("Second minimun Element: "+ secMin(arr));
    }
}
