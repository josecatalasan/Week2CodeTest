package com.example.week2codingtest;

import androidx.collection.ArraySet;

import java.util.ArrayList;

public class Substrings {
    public static void main(String[] args) {
        String string = "frog";
        System.out.println("Input string: " + string);
        ArraySet<String> subStrings = new ArraySet<>();

        subStrings.addAll(getSubstrings(string));
        System.out.println("Output list: " + subStrings.toString());
    }

    public static ArraySet<String> getSubstrings(String s){
        ArraySet<String> returnList = new ArraySet<>();
        for(int i=0; i<s.length(); i++){
            String string = s.substring(0,i) + s.substring(i+1);
            returnList.add(string);
            returnList.addAll(getSubstrings(string));
        }
        returnList.remove("");
        return returnList;
    }
}
