package Beginner;

import java.util.Arrays;

// https://www.geeksforgeeks.org/chocolate-distribution-problem/

public class Chocolate {
    public static void main(String[] args) {
        int arr [] = {7, 3, 2, 4, 9, 12, 56};
        int m = 3;

        System.out.println(find(arr,m));
        
    }

    public static void sortArray(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int  temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    
    public static int find(int arr [], int m) {
        sortArray(arr);
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - m ; i++) {
            int min = arr[i];
            int max = arr[i+m-1];
            int gap = max - min;
            if (gap < ans) ans = gap;
        }
        return ans;
    }

}
