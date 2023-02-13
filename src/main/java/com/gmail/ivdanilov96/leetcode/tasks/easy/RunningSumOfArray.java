package com.gmail.ivdanilov96.leetcode.tasks.easy;

import static com.gmail.ivdanilov96.leetcode.tasks.TaskNum.EASY_1480;

import com.gmail.ivdanilov96.leetcode.tasks.Task;

@Task(EASY_1480)
public class RunningSumOfArray {

  public int[] runningSum(int[] nums) {
    int[] sums = new int[nums.length];
    int currSum = 0;
    for (int i = 0; i < nums.length; i++) {
      currSum += nums[i];
      sums[i] = currSum;
    }
    return sums;
  }

}
