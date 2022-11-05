package com.addnewuser.solutions.palindromeNumber;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    @DisplayName("Successful test isPalindrome() for input 121")
    public void testSolution1() {
        assertTrue(new Solution().isPalindrome(121));
    }

    @Test
    @DisplayName("Successful test isPalindrome() for input 1221")
    public void testSolution2() {
        assertTrue(new Solution().isPalindrome(1221));
    }

    @Test
    @DisplayName("Successful test isPalindrome() for input 123")
    public void testSolution3() {
        assertFalse(new Solution().isPalindrome(123));
    }

    @Test
    @DisplayName("Successful test isPalindrome() for input -121")
    public void testSolution4() {
        assertFalse(new Solution().isPalindrome(-121));
    }
}