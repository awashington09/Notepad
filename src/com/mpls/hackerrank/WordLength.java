package com.mpls.hackerrank;

import java.util.HashMap;
import java.util.Map;

public class WordLength {
    public static void main(String[] args) {

    }

    public Map<String, Integer> wordLen(String[] strings) {
        //Create a Hash Map.
        //iterate through the length af the String Array;
        //assign key which is the string
        //count the length of string.
        //place that count as a value for the key value pair.

        Map <String, Integer> dre = new HashMap <String, Integer>();
        for (String s : strings){
            dre.put(s,s.length());

        }
        return dre;
    }

}
