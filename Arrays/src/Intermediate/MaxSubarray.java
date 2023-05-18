package Intermediate;

// https://leetcode.com/problems/maximum-subarray/

public class MaxSubarray {

    public static void main(String[] args) {
        int nums [] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSub1(nums));
    }

    // brute force approach, time complexity = O(n3) , space complexity = O(1);
    public static int maxSub(int nums[]) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int subArraysum = 0;
                for (int k = i; k <=j ; k++) {
                    subArraysum = subArraysum + nums[k];
                    if (subArraysum > maxSum) {
                        maxSum = subArraysum;
                    }
                }
            }
        }
        return maxSum;
    }


    // Optimized Solution by Kadane's Algorithm , time complexity = O(n) , space complexity = O(1);
    public static int maxSub1(int [] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currSum = currSum + nums[i];
            if(currSum > maxSum) {
                maxSum = currSum;
            }
            if (currSum < 0) {
                currSum  = 0;
            }
        }
        return maxSum;
    }

}
