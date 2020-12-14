package com.mpls.BytebyByte;



public class IntegertoRoman {
    public static String integerToRoman(int roman){
        String[] thousands = new String[] {"", "M", "MM", "MMM"};
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] ones = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};



        return  thousands[roman/1000] + hundreds[(roman % 1000) / 100] + tens [(roman % 100) / 10] + ones [(roman % 10)];

    }

    public static void main(String[] args) {
        System.out.println(integerToRoman(2867));
    }
}
