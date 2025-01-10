package org.example.ArraysClass;

import java.util.Arrays;

public class ArraysClass {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int index = Arrays.binarySearch(numbers,4);

        System.out.println("The index of element 4 in the array is "+index);

        Integer[] number = {10,2,32,12,15,76,17,45,85,99,22,14};
        Arrays.sort(number);

        Arrays.fill(number,12);

        for (int i : number){
            System.out.println(i + " ");
        }

    }
}
