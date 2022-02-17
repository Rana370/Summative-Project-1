package com.company;

import java.util.Scanner;

public class ArrayFunUserArray {
    public static void main(String[] args) {
        int[] array = new int[5];

        Scanner myScanner = new Scanner(System.in);
        for (int i =0; i<array.length; i++ ) {
            System.out.println("Please enter a number between 5-20: ");
            array[i] = Integer.parseInt(myScanner.nextLine());
        }



        for (int element: array ) {
            System.out.println(element);
        }

    }

}
