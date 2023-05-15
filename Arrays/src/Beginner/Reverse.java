package Beginner;

// https://www.geeksforgeeks.org/write-a-program-to-reverse-an-array-or-string/

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int arr[] = {4,5,1,2};
        System.out.println(Arrays.toString(arr));

        reverseArray(arr);

        System.out.println(Arrays.toString(arr));

    }

    public  static void reverseArray(int [] arr) {
        int i = 0;
        int j = arr.length-1;

        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
