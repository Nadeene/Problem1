/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.namark.problem1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Natalia
 */
public class Problem4 {

    public int findFactorsOfTheLargestPalindromicProduct(int digit) {
        int max = 0;
        int upperLimit = calcUpperLimit(digit);
        int lowerLimit = calcLowerLimit(digit);
        int tempI = 0, tempJ = 0;
        for (int i = upperLimit; i >= lowerLimit; i--) {
            for (int j = upperLimit; j >= i; j--) {  
                if (isPalindromicProduct(i * j)) {
                    System.out.println("a: " + i + " b: " + j + " wynik: " + i * j + "to palindrom?: " + isPalindromicProduct(i * j));
                    max = Math.max(i * j, max);
                }
            }
        }
        return max;

    }

    private static int calcUpperLimit(int digit) {
        return (int) Math.pow(new Double("10"), (double) digit) - 1;
    }

    private static int calcLowerLimit(int digit) {
        return (int) Math.pow(new Double("10"), (double) digit - 1);
    }

    private static boolean isPalindromicProduct(int number) {
        return isPalindrome(Integer.toString(number));
    }

    private static boolean isPalindrome(String str) {
        StringBuffer strBuf = new StringBuffer(str).reverse();
        return str.equalsIgnoreCase(strBuf.toString());
    }

}
