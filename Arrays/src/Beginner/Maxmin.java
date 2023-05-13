package Beginner;

// https://www.geeksforgeeks.org/maximum-and-minimum-in-an-array/

import java.util.Arrays;

public class Maxmin {
    public static void main(String[] args) {
        int arr[] = {1000,11,445,1,330,3000};
//        System.out.println(Arrays.toString(findMaxMin(arr)));
        findMaxMin1(arr);
    }

    //1st

    public static int[] findMaxMin(int[] arr) {
        if (arr == null || arr.length == 0)return new int[] {-1,-1};
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if (min > arr[i]){
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        int [] ans = {min, max};
        return ans;
    }


    // 2nd

    public static void findMaxMin1(int[] arr) {
        if (arr == null || arr.length == 0)return;
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length ; i++) {
            min = Math.min(min,arr[i]);
            max = Math.max(max,arr[i]);
        }
        System.out.println(max + " maximum");
        System.out.println(min+ " Minimum");

    }
}
