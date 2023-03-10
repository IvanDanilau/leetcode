package com.gmail.ivdanilov96.leetcode.tasks.easy;

import com.gmail.ivdanilov96.leetcode.tasks.Task;
import com.gmail.ivdanilov96.leetcode.tasks.TaskNum;

@Task(TaskNum.EASY_125)
public class ValidPalidrome {

  public boolean isPalindrome(String s) {
    s = s.toLowerCase();
    StringBuilder builder = new StringBuilder();
    for (char ch : s.toCharArray()) {
      if ((ch - 'a' >= 0 && ch - 'a' <= 25) || (ch - '0' >= 0 && ch - '0' <= 9)) {
        builder.append(ch);
      }
    }
    return builder.toString().equals(builder.reverse().toString());
  }


}
