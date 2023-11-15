package com.java;

import java.util.Arrays;

public class ImmediateSmaller11 {

    public static int[] immediateSmaller(int[] numbers) {
        int[] result = new int[numbers.length];
        result[numbers.length - 1] = -1;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1])
                result[i] = numbers[i + 1];
            else
                result[i] = -1;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 5, 3};
        int n = arr.length;

        System.out.println("Original Array:");
        System.out.println(Arrays.toString(arr));

        int[] result = immediateSmaller(arr);
        System.out.println("Array after modification: " + Arrays.toString(result));
    }
}


