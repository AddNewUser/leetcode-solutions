package com.addnewuser.solutions.twoSum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

        @Test
        void testSolution1() {
            int[] expected = new int[]{0, 1};
            int[] input = new int[]{2, 7, 11, 15};
            int target = 9;
            assertArrayEquals(expected, new Solution().twoSum(input, target));
        }

        @Test
        void testSolution2() {
            int[] expected = new int[]{1, 2};
            int[] input = new int[]{3, 2, 4};
            int target = 6;
            assertArrayEquals(expected, new Solution().twoSum(input, target));
        }

        @Test
        void testSolution3() {
            int[] expected = new int[]{0, 1};
            int[] input = new int[]{3, 3};
            int target = 6;
            assertArrayEquals(expected, new Solution().twoSum(input, target));
        }
    }