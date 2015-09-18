/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.namark.problem1;

import java.util.Arrays;

/**
 *
 * @author Natalia
 */
public class SortowanieTablic {

    public static int[] merge(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int actualPosition = 0;
        int actualPositionInB = 0;
        for (int i = 0; i < a.length; i++) {
            if (actualPositionInB == b.length) {
                result[actualPosition] = a[i];
                actualPosition += 1;

            }

            for (int j = actualPositionInB; j < b.length; j++) {
                if (a[i] < b[j]) {
                    result[actualPosition] = a[i];
                } else if (a[i] == b[j]) {
                    result[actualPosition] = a[i];
                    actualPosition += 1;
                    result[actualPosition] = b[j];
                    actualPositionInB = j + 1;
                } else {
                    result[actualPosition] = b[j];
                    actualPositionInB = j + 1;
                }
                /*
                if (a[i] <= b[j]) {
                    result[actualPosition] = a[i];
                    actualPosition += 1;
                }
                if (a[i] >= b[j]) {
                    result[actualPosition] = b[j];
                    actualPosition += 1;
                    actualPositionInB = j + 1;
                }
                */

            }

        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = {3, 4, 5};
        int[] b = {1, 2, 3};
        System.out.println(Arrays.toString(merge(a, b)));
    }

}
