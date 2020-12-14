package com.mpls;

import java.sql.SQLOutput;
import java.util.Stack;
import java.util.Scanner;
public class Day11Excercise {
    // given a string with a length greater than 0, return the reverse form of the String.
    // return String, Parameter string.

    //stacking seems to be best fit here. Input the string when prompted, load the stack for last in first out.
    //then print the values out in stack method.

    //my attempt

    //public static void main(String[] args) {
      //  System.out.println(excercise());



    public static void excercise(){
        Scanner dre = new Scanner(System.in);
        System.out.println("Hello! Enter a Word please:");
        String input = dre.next();
        Stack<Character> test = new Stack<>();
        test.push(input.charAt(4));
        test.push(input.charAt(3));
        test.push(input.charAt(2));
        test.push(input.charAt(1));
        test.push(input.charAt(0));
        for(int i = 4; i >= 0; i--) {
            //System.out.println(test.pop(i));
        }



    }
}
