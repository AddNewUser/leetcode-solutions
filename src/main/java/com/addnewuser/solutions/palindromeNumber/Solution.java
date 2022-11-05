/*
 Given an integer x, return true if x is a palindrome, and false otherwise.
 */

package com.addnewuser.solutions.palindromeNumber;

public class Solution {

    /**
     * Reverse input number.
     *
     * @param input - input number.
     * @return - reversed number.
     */
    public int reverse(int input) {
        int reverse = 0;
        while (input != 0) {
            int remainder = input % 10;
            reverse = reverse * 10 + remainder;
            input = input / 10;
        }
        return reverse;
    }

    /**
     * Return true if x is a palindrome, and false otherwise.
     *
     * @param x - input number to check.
     * @return - true if input number is a palindrome, and false otherwise.
     */
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        return x == reverse(x);
    }
}