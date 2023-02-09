package com.gmail.ivdanilov96.leetcode.tasks.easy;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentEvenElement {

  public int mostFrequentEven(int[] nums) {
    int max = -1;
    int maxRepeats = -1;
    Map<Integer, Integer> repeats = new HashMap<>();
    for (int num : nums) {
      if (num % 2 == 0) {
        int count = repeats.getOrDefault(num, 0) + 1;
        repeats.put(num, count);
        if (maxRepeats == count) {
          max = Math.min(max, num);
        }
        if (maxRepeats < count) {
          max = num;
          maxRepeats = count;
        }
      }
    }
    return max;
  }

}
