package com.company;


public class ArrayFunReverselt {
    public static void main(String[] args) {

        int[] array = new int[5];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;

        System.out.println("In order Array : ");
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]+" ");
        }
        System.out.println("In reversed Array : ");
        for(int i=array.length-1;i>=0;i--) {
            System.out.println(array[i] + " ");
        }
    }
}
