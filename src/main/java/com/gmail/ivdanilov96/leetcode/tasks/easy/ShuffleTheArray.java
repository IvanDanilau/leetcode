package com.gmail.ivdanilov96.leetcode.tasks.easy;

import com.gmail.ivdanilov96.leetcode.tasks.Task;
import com.gmail.ivdanilov96.leetcode.tasks.TaskNum;

@Task(TaskNum.EASY_1470)
public class ShuffleTheArray {

  public int[] shuffle(int[] nums, int n) {
    int[] newNums = new int[nums.length];
    for (int i = 0; i < n; i++) {
      newNums[i * 2] = nums[i];
      newNums[i * 2 + 1] = nums[i + n];
    }
    return newNums;
  }
}
