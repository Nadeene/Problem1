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

    public int sumMultiplesInUpperLimit(int[] numbers, int upperLimit) {
        int result = 0;
        int multiplied = 1;
        for (int number : numbers) {
            result += sumMultipleInUpperLimit(number, upperLimit);
            multiplied *= number;
        }
        result -= sumMultipleInUpperLimit(multiplied, upperLimit);
        return result;
    }

    private int sumMultipleInUpperLimit(int number, int upperLimit) {
        int result = 0;
        int iterations = (upperLimit - 1) / number;
        for (int i = 1; i <= iterations; i++) {
            result += i * number;
        }
        return result;
    }
}
