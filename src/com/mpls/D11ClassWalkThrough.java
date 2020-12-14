package com.mpls;

public class D11ClassWalkThrough {

    public static void main(String[] args) {
        String name = "Andre";
        char [] array = name.toCharArray();
        for (int i = array.length -1; i >=0; i--){
            System.out.println(array[i]);

        }
        System.out.println("  " + name);
    }


}
