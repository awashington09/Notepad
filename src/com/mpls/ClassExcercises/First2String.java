package com.mpls.ClassExcercises;

public class First2String {
    //when given a String, return the first two letters of the string.
    // if the string is 2 characters or less, return the string.

    public static String firstTwo(String dre ){
        //Create an if else statement with two scenarios.
        if (dre.length() <= 2){
            return dre;
        }else {
            char[] tmp = dre.toCharArray();
            char [] temp2 = new char[2];
            //StringBuilder dre2 = new StringBuilder();
            for (int i = 0; i < 2; i++) {

                temp2[i] = tmp [i];

            }
            return temp2.toString();
            }
        //take the string we have and convert it into char array.
        //take the first two elements out and return them.
        //convert those chars to string.
        //return string;
    }

    public static void main(String[] args) {
        System.out.println(firstTwo("Hello"));

    }
}
