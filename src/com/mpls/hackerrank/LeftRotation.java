package com.mpls.hackerrank;

public class LeftRotation {

    public static void main(String[] args) {
        

    }

static int [] leftRotate(int [] a, int d){
        /**Awushies and Terrances wak through
         * **/
//declare in n = num of elems in arr.
//check value of d
    //going recursion, base case d= 0
    //else we want to rotate the elements.
    int n = a.length;
    if (d == 0){
        for (int i = 0; i < n; i++) {
            System.out.println(a[i] + " ");

        }
    }else{
        int temp = 0;
        for (int j = 0; j < n-1; j++) {
            a[j] = a[j+1];
            temp = a[j];
            leftRotate(a,d-1);
        }

    }
return a;
}



}
