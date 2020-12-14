package com.mpls.hackerrank;

public class MinimumSwaps {

    static int miniSwaps(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == i + 1) continue;
            count++;
            int tmp = arr[i];
            arr[i] = arr[tmp - 1];
            arr[tmp - 1] = tmp;
            i--;
        }
        return count;

    }


    public static void main(String[] args) {

        int[] james = {4,5,6,2,1,3};
        System.out.println(miniSwaps(james));

    }
}
