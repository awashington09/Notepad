package com.mpls.hackerrank;

import java.util.ArrayList;
import java.util.Collections;

public class Array2D {
    /*given a 2D 6x6 array arr, and hour glass A is a subset of values with indices falling in this pattern in
    arr's graphical representation. There are 16 hourglasses in arr. Print the maximum hourglass sum.
     */


    public static void main(String[] args) {
        int[][] arr = {{-9, -9, -9, 1, 1, 1},
                {0, -9, 0, 4, 3, 2},
                {-9, -9, -9, 1, 2, 3},
                {0, 0, 8, 6, 6, 0},
                {0, 0, 0, -2, 0, 0},
                {0, 0, 1, 2, 4, 0}};


        System.out.println(hourglassMaxSum(arr));

    }
    public static int hourglassMaxSum(int[][] arr){
        //for hour glass sum, create an empty array list.
        ArrayList<Integer> sums= new ArrayList<>();
        //nested for loop
        for (int i = 0; i <= 3 ; i++) {//going through the first set of indices
            for (int j = 0; j <=3 ; j++) {//going through the Arrays in the array.
                int hourglassSum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                        sums.add(hourglassSum);

            }
        }
        Collections.sort(sums);
        int maxSum= sums.get(sums.size()-1);
        //with in the nested for loop, calculate hourglass sum and add to array list.
        //sort array list, return maximum sum.
        return maxSum;

    }
}
