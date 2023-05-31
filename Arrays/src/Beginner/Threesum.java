package Beginner;

import java.util.Scanner;

// Count the triplets whose sum is equal to the given value x.

public class Threesum {

    static int tripleSum(int [] arr, int target) {
        int ans  = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        ans++;
                    }
                }
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
        System.out.print("Enter the tagret value: ");
        int target = sc.nextInt();

        System.out.println(tripleSum(arr,target));


    }
}
