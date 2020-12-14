package com.mpls.CodingBat;


//Given a non-empty array, return true if there is a place to split the array so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.


  //      canBalance([1, 1, 1, 2, 1]) → true
    //    canBalance([2, 1, 1, 2, 1]) → false


public class CanBalance {
    //Pseduo Code:
    //Create 2 variables to hold left and right side of Array.
    //

    public static boolean canBalace(int [] nums){
        int leftSide = 0;
        int rightSide = 0;

        //to interate through [] nums, and add all the elements to generate the right side to compare.
        for (int i = 0; i < nums.length; i++) {
            rightSide += nums[i];
        }
        // preventing 0 from being compared by cutting the length of the array by 1.
        for (int i = 0; i < nums.length-1; i++) {
            //adding elements at beginning of nums to variable leftSide.
            leftSide += nums[i];
            // removing elements added to the variable leftSide from the rightSide.
            rightSide -= nums[i];
            if (leftSide == rightSide){
                return true;
            }

        } return false;
    }


    public static void main(String[] args) {

        int [] nums = {1, 1, 1, 2, 1};
        int [] numsF= {2, 1, 1, 2, 1};

        System.out.println(canBalace(nums));
        System.out.println(canBalace(numsF));


    }



}
