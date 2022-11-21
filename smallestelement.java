package com.bridgelabz;

public class smallestelement {
    public static void main(String[] args) {
        int [] arr = new int [] {5, 0, 8, 41, 25};
        //Initialize min with first element of array.
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            //Compare elements of array with min
            if(arr[i] <min)
                min = arr[i];
        }
        System.out.println("Smallest element present in given array: " + min);

    }
}
