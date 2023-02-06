package com.gmail.ivdanilov96.leetcode.tasks.medium;

import com.gmail.ivdanilov96.leetcode.tasks.Task;
import com.gmail.ivdanilov96.leetcode.tasks.TaskNum;
import java.util.Arrays;

@Task(TaskNum.MEDIUM_567)
public class PermutationInString {

  public boolean checkInclusion(String s1, String s2) {
    s1 = sorted(s1);
    for (int i = 0; i <= (s2.length() - s1.length()); i++) {
      String substring = sorted(s2.substring(i, i + s1.length()));
      if (s1.startsWith(substring)) {
        return true;
      }
    }
    return false;
  }

  private String sorted(String str) {
    char[] pattern = str.toCharArray();
    Arrays.sort(pattern);
    return new String(pattern);
  }
}
