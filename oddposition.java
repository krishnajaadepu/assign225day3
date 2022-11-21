package com.bridgelabz;

public class oddposition {
    public static void main(String[] args) {
        int [] arr = new int [] {1, 1, 9, 9, 0};
        System.out.println("Elements of given array present on odd position: ");
        //Loop through the array by incrementing value of i by 2
        for (int i = 0; i < arr.length; i = i+2) {
            System.out.println(arr[i]);
        }
    }
}
