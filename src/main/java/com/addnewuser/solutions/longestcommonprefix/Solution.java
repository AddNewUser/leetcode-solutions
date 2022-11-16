/*
Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".

Input: strs = ["flower","flow","flight"]
Output: "fl"

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 */

package com.addnewuser.solutions.longestcommonprefix;

import java.util.Objects;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (Objects.isNull(strs) || strs.length == 0) {
            throw new IllegalArgumentException();
        }

        if (strs.length == 1) {
            return strs[0];
        }

        StringBuilder result = new StringBuilder();

        int height = strs[0].length();
        int length = strs.length;
        int y = 0;

        out:
        while (y < height) {

            int x = 1;
            while (x < length) {
                if (y >= strs[x].length()) break out;
                char sample = strs[0].charAt(y);
                if (sample != strs[x].charAt(y)) break out;
                if (x == (length - 1)) {
                    result.append(sample);
                    break;
                }
                x++;
            }
            y++;
        }
        return result.toString();
    }
}