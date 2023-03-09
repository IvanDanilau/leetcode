package com.gmail.ivdanilov96.leetcode.tasks.medium;

import com.gmail.ivdanilov96.leetcode.tasks.Task;
import com.gmail.ivdanilov96.leetcode.tasks.TaskNum;

@Task(TaskNum.MEDIUM_875)
public class KokoEatingBananas {

  public int minEatingSpeed(int[] piles, int h) {
    int min = 1;
    int max = 1;
    for (int pile: piles) {
      max = Math.max(max, pile);
    }
    while (min <= max) {
      int step = min + (max - min) / 2;
      long currHours = eatBananas(piles, step);
      if (currHours <= h){
        max = step - 1;
      } else {
        min = step + 1;
      }
    }
    return min;
  }

  private long eatBananas(int[] piles, int step) {
    long hours = 0;
    for (int pile: piles) {
      hours += pile / step;
      if (pile % step != 0){
        hours++;
      }
    }
    return hours;
  }


}
