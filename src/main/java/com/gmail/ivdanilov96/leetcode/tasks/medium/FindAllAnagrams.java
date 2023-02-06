package com.gmail.ivdanilov96.leetcode.tasks.medium;

import com.gmail.ivdanilov96.leetcode.tasks.Task;
import com.gmail.ivdanilov96.leetcode.tasks.TaskNum;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Task(TaskNum.MEDIUM_438)
public class FindAllAnagrams {

  public List<Integer> findAnagrams(String source, String part) {
    part = sorted(part);
    List<Integer> starts = new ArrayList<>();
    for (int i = 0; i <= source.length() - part.length(); i++) {
      String temp = sorted(source.substring(i, i + part.length()));
      if (temp.equals(part)) {
        starts.add(i);
      }
    }
    return starts;
  }

  private String sorted(String str) {
    char[] pattern = str.toCharArray();
    Arrays.sort(pattern);
    return new String(pattern);
  }

}
