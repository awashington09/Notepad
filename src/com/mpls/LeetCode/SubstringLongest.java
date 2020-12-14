package com.mpls.LeetCode;

//Given a string s, find the length of the longest substring without repeating characters.

/*Example 1:

        Input: s = "abcabcbb"
        Output: 3
        Explanation: The answer is "abc", with the length of 3.
        Example 2:

        Input: s = "bbbbb"
        Output: 1
        Explanation: The answer is "b", with the length of 1.
        Example 3:

        Input: s = "pwwkew"
        Output: 3
        Explanation: The answer is "wke", with the length of 3.
        Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
        Example 4:

        Input: s = ""
        Output: 0*/

import java.util.HashSet;

public class SubstringLongest {
    //initialize 3 variables to identifyu pointers, and max.
    //initialize a HashSet, responsible for holding and checking unique substring

    public static void main(String[] args) {
        String ex = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(ex));


    }

    public static int lengthOfLongestSubstring(String s) {
        int a = 0;//pointer to start of substring.
        int b = 0;//pointer to end of substring.
        int max = 0;

        HashSet<Character> hash_set = new HashSet<>();

        while (b < s.length()){ //ensures that we dont go past the end of the string.
            if(!hash_set.contains(s.charAt(b))){
                hash_set.add(s.charAt(b));
                b++;
                max = Math.max(hash_set.size(), max);//Math.max returns the larger value between the two arguments.
            }else{
                hash_set.remove(s.charAt(a));
                a++;
            }
        }
        return max;
    }
}
