package Beginner;

// https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/

class Duplicatesorted {

    public static void main(String[] args) {
        int [] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }


    public static int removeDuplicates(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] != nums[j]) {
                nums[++j] = nums[i];
            }
        }
        return j + 1;
    }
}