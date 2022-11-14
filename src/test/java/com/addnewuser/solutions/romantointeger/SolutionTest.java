package com.addnewuser.solutions.romantointeger;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SolutionTest {

    @Test
    @DisplayName("Successful test romanToInt() for input I")
    public void testRomanToInt1() {
        assertEquals(1, new Solution().romanToInt("I"));
    }

    @Test
    @DisplayName("Successful test romanToInt() for input III")
    public void testRomanToInt2() {
        assertEquals(3, new Solution().romanToInt("III"));
    }

    @Test
    @DisplayName("Successful test romanToInt() for input LVIII")
    public void testRomanToInt3() {
        assertEquals(58, new Solution().romanToInt("LVIII"));
    }

    @Test
    @DisplayName("Successful test romanToInt() for input MCMXCIV")
    public void testRomanToInt4() {
        assertEquals(1994, new Solution().romanToInt("MCMXCIV"));
    }

    @Test
    @DisplayName("Failure test romanToInt() for incorrect input Hello World")
    public void testRomanToInt5() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Solution().romanToInt("Hello World");
        });
    }
}