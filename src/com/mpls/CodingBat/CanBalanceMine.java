package com.mpls.CodingBat;

public class CanBalanceMine {
    public static boolean canBalance(int[] nums) {
        if (nums.length <= 1){
            return false;
        }
        int leftSum = 0;

        for (int i = 0; i < nums.length; i++){
            leftSum += nums[i];
            int rightSum = 0;

            for (int j = nums.length - 1; j > i ; j--){
                rightSum += nums[j];
            }
            if (leftSum == rightSum){
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        int [] nums = {1, 3, 0, 3, 1};
        int [] numsF = {1, 3, 5, 3, 1};


        System.out.println(canBalance(nums));
        System.out.println(canBalance(numsF));
    }
}
