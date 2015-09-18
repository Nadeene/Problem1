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
public class Problem3 {

    public long findLargestPrimeFactor(long number) {
        long newNumber = number;
        long primeFactor = 1;
        while (newNumber != 1) {
            primeFactor += 1;
            while (newNumber % primeFactor == 0) {
                newNumber /= primeFactor;
            }
        }
        return primeFactor;
    }

}
