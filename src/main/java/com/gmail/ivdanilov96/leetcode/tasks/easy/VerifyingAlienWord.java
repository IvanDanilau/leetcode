package com.gmail.ivdanilov96.leetcode.tasks.easy;

import com.gmail.ivdanilov96.leetcode.tasks.Task;
import com.gmail.ivdanilov96.leetcode.tasks.TaskNum;

@Task(TaskNum.EASY_953)
public class VerifyingAlienWord {

  public boolean isAlienSorted(String[] words, String order) {
    for (int i = 0; i < words.length - 1; i++) {
      String prev = words[i];
      String next = words[i + 1];
      if (!correctOrder(prev, next, order)) {
        return false;
      }
    }
    return true;
  }

  private boolean correctOrder(String prev, String next, String order) {
    int len = Math.min(prev.length(), next.length());
    for (int i = 0; i < len; i++) {
      if (order.indexOf(prev.charAt(i)) == order.indexOf(next.charAt(i))) {
        continue;
      }
      return order.indexOf(prev.charAt(i)) < order.indexOf(next.charAt(i));
    }
    return (prev.length() <= next.length());
  }
}