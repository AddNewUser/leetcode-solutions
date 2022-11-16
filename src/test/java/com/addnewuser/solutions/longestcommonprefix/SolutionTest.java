package com.addnewuser.solutions.longestcommonprefix;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SolutionTest {

    @Test
    @DisplayName("Successful test longestCommonPrefix() for input {\"cir\",\"car\"}")
    public void testLongestCommonPrefix1() {
        assertEquals("c", new Solution().longestCommonPrefix(new String[]{"cir", "car"}));
    }

    @Test
    @DisplayName("Successful test longestCommonPrefix() for input {\"flower\",\"flow\",\"flight\"}")
    public void testLongestCommonPrefix2() {
        assertEquals("a", new Solution().longestCommonPrefix(new String[]{"a"}));
    }

    @Test
    @DisplayName("Successful test longestCommonPrefix() for input {\"a\"}")
    public void testLongestCommonPrefix3() {
        assertEquals("fl", new Solution().longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
    }

    @Test
    @DisplayName("Successful test longestCommonPrefix() for input {\"dog\",\"racecar\",\"car\"}")
    public void testLongestCommonPrefix4() {
        assertEquals("", new Solution().longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
    }

    @Test
    @DisplayName("Failure test longestCommonPrefix() for incorrect input null")
    public void testLongestCommonPrefix5() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Solution().longestCommonPrefix(null);
        });
    }

    @Test
    @DisplayName("Failure test longestCommonPrefix() for incorrect input new String(){}")
    public void testLongestCommonPrefix6() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Solution().longestCommonPrefix(new String[]{});
        });
    }
}