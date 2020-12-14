package com.mpls.CodingBat;

import java.util.Map;

public class MapAB2 {
    /*Modify and return the given map as follows: if the keys "a" and "b" are both in the map and have equal values, remove them both.


            mapAB2({"a": "aaa", "b": "aaa", "c": "cake"}) → {"c": "cake"}
    mapAB2({"a": "aaa", "b": "bbb"}) → {"a": "aaa", "b": "bbb"}
    mapAB2({"a": "aaa", "b": "bbb", "c": "aaa"}) → {"a": "aaa", "b": "bbb", "c": "aaa"}*/



    public static void main(String[] args) {

    }
    public Map<String, String> mapAB2(Map<String, String> map){
        //create if statement to see if a and b keys are present;
        //nested if statement to check the values of a and b are the same;
        //remove the key, and by default the value;
        // return the map;
        if(map.containsKey("a") && map.containsKey("b")){
            if(map.get("a") == map.get("b")){
                map.remove("a");
                map.remove("b");
            }
        }
    return map;
    }
}
