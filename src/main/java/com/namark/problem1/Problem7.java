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
public class Problem7 {

    public int findPrimeNumberOfIndex(int i) {
        List<Integer> primeNumber = new ArrayList<>();
        int j = 2;
        while (primeNumber.size() < i) {
            if (isDividableByNumbers(primeNumber, j)) {
                primeNumber.add(j);
            }
            j++;
        }
        return primeNumber.get(primeNumber.size() - 1);
    }

    private boolean isDividableByNumbers(List<Integer> numbers, int number) {
        if (numbers.isEmpty()) {
            return true;
        }
        boolean isPrime = true;
        for (int i : numbers) {
            if (number % i == 0) {
                isPrime = false;
            }
            if (!isPrime) {
                break;
            }
        }
        return isPrime;
    }

}
