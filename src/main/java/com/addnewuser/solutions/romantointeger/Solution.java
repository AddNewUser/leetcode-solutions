/*
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000

For example, 2 is written as II in Roman numeral, just two ones added together.
12 is written as XII, which is simply X + II.
The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right.
However, the numeral for four is not IIII. Instead, the number four is written as IV.
Because the one is before the five we subtract it making four.
The same principle applies to the number nine, which is written as IX.

There are six instances where subtraction is used:
I can be placed before V (5) and X (10) to make 4 and 9.
X can be placed before L (50) and C (100) to make 40 and 90.
C can be placed before D (500) and M (1000) to make 400 and 900.

Given a roman numeral, convert it to an integer.
 */
package com.addnewuser.solutions.romantointeger;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Solution {

    /**
     * Convert input Roman symbol to int value.
     * Throws IllegalArgumentException if input symbol is incorrect.
     *
     * @param symbol - input symbol I, V, X, L, C, D and M.
     * @return - converted int value.
     */
    private static int convert(char symbol) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        return map.computeIfAbsent(symbol, e -> {
            throw new IllegalArgumentException("Input character is not a Roman number");
        });
    }

    /**
     * Convert input String with Roman number to the int value.
     * Throws IllegalArgumentException if input is incorrect.
     *
     * @param s - input String with Roman number
     * @return - converted int value.
     */
    public int romanToInt(String s) {
        if (Objects.isNull(s) && s.isBlank()) {
            throw new IllegalArgumentException("Input string in null or blank");
        }

        if (s.length() == 1) {
            return convert(s.charAt(0));
        }

        char[] input = s.toCharArray();
        int result = convert(input[input.length - 1]);

        for (int i = input.length - 2; i >= 0; i--) {

            int current = convert(input[i]);
            int next = convert(input[i + 1]);

            if (current < next) {
                result -= current;
            } else {
                result += current;
            }
        }
        return result;
    }
}
