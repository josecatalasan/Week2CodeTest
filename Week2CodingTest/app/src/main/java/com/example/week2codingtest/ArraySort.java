package com.example.week2codingtest;

import java.util.Arrays;

public class ArraySort {

    public static void main(String[] args) {
        int [] toSort = {2,8,9,3,4,3,2,6,6,2,4,9,8};
        System.out.println("Input array: " + Arrays.toString(toSort));

        int temp = 0;
        for(int i=0; i<toSort.length; i++){
            for(int j=i+1; j<toSort.length; j++){
                if(toSort[i] > toSort[j]){
                    //swap
                    temp = toSort[i];
                    toSort[i] = toSort[j];
                    toSort[j] = temp;
                }
            }
        }
//        Arrays.sort(toSort);
        System.out.println("Output array: " + Arrays.toString(toSort));

    }
}
