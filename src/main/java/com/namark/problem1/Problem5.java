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
public class Problem5 {
/*
    public static void main(String[] args) {
        System.out.println(findSmalestMultipleOfEvenNumbersInLimit(10));
    }
    */

    public static int findSmalestMultipleOfEvenNumbersInLimit(int limit) {
        List<Integer> factors = prepareFactors(limit);
        int number = 1;
        while (!factors.isEmpty()) {
            System.out.println("Lista niepusta");
            int factor = factors.get(factors.size() - 1);
            System.out.println("Dzielnik: " + factor);
            number *= factor;
            System.out.println("Liczba wyjściowa: " + number);
            factors = eliminateMultipleFactors(factors, factor);
            for (int newFactor : factors) {
                System.out.println("Nowy dzielnik: " + newFactor);
            }
        }
        return number;
    }

    private static List<Integer> prepareFactors(int limit) {
        List<Integer> factors = new ArrayList<>();
        for (int i = 1; i <= limit; i++) {
            //if (i % 2 != 0) {
            factors.add(i);
            System.out.println(i);
            //}
        }
        return factors;

    }

    private static List<Integer> eliminateMultipleFactors(List<Integer> factors, int divisor) {
        List<Integer> newFactors = new ArrayList<>();
        for (int factor : factors) {
            if (!isDividableByFactor(divisor, factor)) {
                for (int i = 1; i <= divisor; i++) {
                    
                }
                newFactors.add(factor);
            }
        }
        return newFactors;
    }

    private static boolean isDividableByFactor(int number, int factor) {
        return number % factor == 0;
    }

}
