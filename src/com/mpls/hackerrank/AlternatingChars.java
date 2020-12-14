package com.mpls.hackerrank;

public class AlternatingChars {

    static int altCharacters(String s) {
        int numOfDeletions = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                numOfDeletions++;


            }
        }
        return numOfDeletions;
    }

        public static void main (String[]args){

        System.out.println(altCharacters("aaaabbbbaba"));

        }
    }

