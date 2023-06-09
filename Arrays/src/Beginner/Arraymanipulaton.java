package Beginner;

import java.util.Scanner;

// find the unique number in a given Array where all the elements are being repeated twice with one value being unique

public class Arraymanipulaton {

    public static int uniqueNum(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        int ans  = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != -1) {
                ans = arr[i];
            }
        }
        return ans;
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
        System.out.println(uniqueNum(arr));
    }
}