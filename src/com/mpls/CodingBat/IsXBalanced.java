package com.mpls.CodingBat;

public class IsXBalanced {

    public static void main(String[] args) {
        System.out.println(xyBalance("aaxxxhgjlcby"));
        System.out.println(xyBalance("xyx"));
        System.out.println(xyBalance("yaaxb"));
    }


    /*create a method that checks the last index of y and x*/

    public static boolean xyBalance(String a){
        if (a.lastIndexOf('y') < a.lastIndexOf('x')){
            return false;
        }
        return true;
    }
}
