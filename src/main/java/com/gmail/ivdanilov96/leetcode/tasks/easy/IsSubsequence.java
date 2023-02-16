package com.gmail.ivdanilov96.leetcode.tasks.easy;

import static com.gmail.ivdanilov96.leetcode.tasks.TaskNum.EASY_392;

import com.gmail.ivdanilov96.leetcode.tasks.Task;

@Task(EASY_392)
public class IsSubsequence {

  public boolean isSubsequence(String s, String t) {
    int cursor = 0;
    if (s.isEmpty()) {
      return false;
    }
    for (int i = 0; i < t.toCharArray().length; i++) {
      if (s.charAt(cursor) == t.charAt(i)) {
        cursor++;
      }
      if (cursor == s.length()) {
        return true;
      }
    }
    return false;
  }
}
