package Intermediate;

// https://leetcode.com/problems/find-the-duplicate-number/

import java.util.Arrays;

public class Duplicate {
    public static void main(String[] args) {
        int [] nums = {1,3,4,2,2};
        System.out.println(findDuplicate(nums));
    }


    //1st
    public static int findDuplicate(int [] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return nums[i];
            }
        }
        return -1;
    }

    // 2nd
    public int findDuplicate2(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            if(nums[i] != i+ 1) {
                int correct = nums[i] - 1;
                if(nums[i] != nums[correct]) {
                    swap(nums,i,correct);
                } else{
                    return nums[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }


    public void swap(int [] nums, int i, int correct) {
        int temp  = nums[i];
        nums[i] = nums[correct];
        nums[correct] = temp;
    }

}


