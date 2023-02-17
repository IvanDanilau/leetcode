package com.gmail.ivdanilov96.leetcode.tasks.easy;

import static com.gmail.ivdanilov96.leetcode.tasks.TaskNum.EASY_409;

import com.gmail.ivdanilov96.leetcode.tasks.Task;
import java.util.HashSet;
import java.util.Set;

@Task(EASY_409)
public class LongestPalindrome {

  public int longestPalindrome(String s) {
    Set<Character> keys = new HashSet<>();
    int total = 0;
    for (int i = 0; i < s.toCharArray().length; i++) {
      char ch = s.charAt(i);
      if (keys.remove(ch)) {
        total += 2;
      } else {
        keys.add(ch);
      }
    }
    if (!keys.isEmpty()) {
      total++;
    }
    return total;
  }

  public int longestPalindromeLeetcode(String s) {
    int[] chars = new int[128];
    for (char c : s.toCharArray()) {
      chars[c]++;
    }
    int total = 0;
    for (int val : chars) {
      total += val / 2 * 2;
      if (total % 2 == 0 && val % 2 == 1) {
        total++;
      }
    }
    return total;
  }
}
