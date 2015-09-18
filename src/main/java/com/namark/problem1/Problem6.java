/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.namark.problem1;

/**
 *
 * @author Natalia
 */
public class Problem6 {

    public int findDifferenceBetweenSumOfSquaresAndSquaredSum(int limit) {
        int sum = 0, sum1 = 0;
        for (int i = 1; i <= limit; i++) {
            sum += i * i;
            sum1 += i;
        }
        sum1 *= sum1;
        return sum1 - sum;
    }

}
