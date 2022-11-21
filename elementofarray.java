package com.bridgelabz;

public class elementofarray {
    public static void main(String[] args) {
        int [] arr = new int [] {1, 6, 0, 9, 8};
        System.out.println("Elements of given array: ");

        //Loop through the array by incrementing value of i
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
