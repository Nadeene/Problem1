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
public class Problem1 {

    public int sumMultiplesInUpperLimit(int[] divisors, int upperLimit) {
        int result = 0;
        for (int divisor : divisors) {
            result += sumMultipleInUpperLimit(divisor, upperLimit);
        }
        return result;
    }

    private int sumMultipleInUpperLimit(int divisor, int upperLimit) {
        int result = 0;
        int iterations = (upperLimit - 1) / divisor;
        for (int i = 1; i <= iterations; i++) {
            result += i * divisor;
        }
        return result;
    }
}
