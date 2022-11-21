package com.bridgelabz;

public class largestelement {
    public static void main(String[] args) {
        int [] arr = new int [] {2, 1, 17, 5, 20};
        //Initialize max with first element of array.
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            //Compare elements of array with max
            if(arr[i] > max)
                max = arr[i];
        }
        System.out.println("Largest element present in given array: " + max);
    }
}
