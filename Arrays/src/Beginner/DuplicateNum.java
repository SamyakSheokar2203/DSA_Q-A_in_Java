package Beginner;

// https://leetcode.com/problems/contains-duplicate/

import java.util.Arrays;

public class DuplicateNum {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        boolean ans = containsDuplicate(nums);
        System.out.println(ans);
    }

    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;
    }
}
