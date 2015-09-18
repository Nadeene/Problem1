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
public class Problem2 {

    public int sumOfEvenFibonacciNumbersInLimit(int limit) {
        int var1 = 0, var2 = 1;
        int fib = 0, sum = 0;
        while (fib <= limit) {
            fib = var1 + var2;
            var1 = var2;
            var2 = fib;
            if (fib % 2 == 0) {
                sum += fib;
            }
        }
        return sum;
    }

}
