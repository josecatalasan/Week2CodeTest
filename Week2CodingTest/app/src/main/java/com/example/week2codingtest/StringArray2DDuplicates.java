package com.example.week2codingtest;

import android.util.ArraySet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class StringArray2DDuplicates {
    public static void main(String[] args) {
        String[][] array = {{"a", "b", "c"},
                            {"d", "e", "f"},
                            {"g", "a", "b"}};

        System.out.println("Input array: " + "{\n" +
                Arrays.toString(array[0]) + ",\n" +  Arrays.toString(array[1]) + ",\n" + Arrays.toString(array[2]) + " }");

        ArrayList<int[]> duplicateArray = findDuplicates(array);

        System.out.print("Output coordinates: ");
        for(int i=0; i<duplicateArray.size(); i++){
            System.out.print("("+ duplicateArray.get(i)[0]+ ", " + duplicateArray.get(i)[1] + ") ");
        }
    }

    public static ArrayList<int[]> findDuplicates(String[][] array){
        HashMap<String, ArrayList<int[]>> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (!map.containsKey(array[i][j])) {
                    map.put(array[i][j], new ArrayList<int[]>());
                    map.get(array[i][j]).add(new int[]{i, j});
                } else {
                    map.get(array[i][j]).add(new int[]{i, j});
                }
            }
        }

        //return duplicate coordinates
        Set<String> keySet = map.keySet();
        ArrayList<int[]> duplicateCoordinates = new ArrayList<>();
        for (String s : keySet) {
            if (map.get(s).size() > 1) {
                //print out coordinates
                for (int i = 0; i < map.get(s).size(); i++) {
                    duplicateCoordinates.add(map.get(s).get(i));
                }
            }
        }
        return duplicateCoordinates;
    }
}
