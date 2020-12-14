package com.mpls.LeetCode;

import java.util.Arrays;

public class Anagram {
    public boolean isAnagram(String s, String t) {
            if(s.length() != t.length()){
                return false;}

                char [] sTemp = s.toCharArray();
                char [] tTemp = t.toCharArray();
                Arrays.sort(sTemp);
                Arrays.sort(tTemp);

            for (int i = 0; i < sTemp.length; i++) {
                if(sTemp[i] != tTemp[i]){
                    return false;
                }
                }
            return true;
            }
            }


