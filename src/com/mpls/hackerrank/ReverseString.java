package com.mpls.hackerrank;

public class ReverseString {
    //when given a String called str, create a method that returns the reversed version of
    // that string.


    public static String reversal(String str){
        //Take in String and use StringBuilder Method to build a new string.
        StringBuilder reversed = new StringBuilder(str).reverse();
        //use the .reverse function to reverse the original sting that came in.
        //in order to return a string, we have to convert string builder back to string.
        String str1 = reversed.toString();
        return str1;
    }




    public static void main(String[] args) {
        System.out.println(reversal("Racecar"));

    }
}
