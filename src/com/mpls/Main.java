package com.mpls;

public class Main {
    static byte myByte;
    static int myInt;
    static short myShort;
    static double myDouble;
    static float myFloat;
    static char myChar;
    static long myLong;
    static boolean myBool;
    static String myString;

    
    public static void main(String[] args) {
        /*myByte = 1;
        myInt = 4;
        myShort = 3;
        myDouble = 4.876;
        myFloat = 4.3f;
        myChar = 'e';
        myBool = false;
        myLong = 7000;
        myString = "808 & heartbreak";
*/
	// write your code here
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Minimum Value = " + myMinFloatValue);
        System.out.println("Float Maximum Value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Minimum Value = " + myMinDoubleValue);
        System.out.println("Double Maximum Value = " + myMaxDoubleValue);

    }
}
