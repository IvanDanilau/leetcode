package com.gmail.ivdanilov96.leetcode.tasks.easy;

import static com.gmail.ivdanilov96.leetcode.tasks.TaskNum.EASY_724;

import com.gmail.ivdanilov96.leetcode.tasks.Task;

@Task(EASY_724)
public class FindPivotIndex {

  public int pivotIndex(int[] nums) {
    int sumRight = 0;
    for (int i = nums.length - 1; i >= 0; i--) {
      sumRight += nums[i];
    }
    int sumLeft = 0;
    for (int i = 0; i < nums.length; i++) {
      sumRight -= nums[i];
      if (sumLeft == sumRight) {
        return i;
      } else {
        sumLeft += nums[i];
      }
    }
    return -1;
  }

}
