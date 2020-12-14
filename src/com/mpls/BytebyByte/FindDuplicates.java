package com.mpls.BytebyByte;

import java.util.ArrayList;
import java.util.Collections;

public class FindDuplicates {
//write a function that finds all the duplicates in a function.

    public int repeatedNumber(ArrayList<Integer> list) {
        if (list.size() <= 1) {
            return -1;
        }
        Collections.sort(list);
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) == list.get(i + 1)) {
                return list.get(i);
            }
        }
        return -1;
    }

    public static void main(String[] args) {

    }
}
