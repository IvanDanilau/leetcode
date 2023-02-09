package com.gmail.ivdanilov96.leetcode.tasks.easy;

import static com.gmail.ivdanilov96.leetcode.tasks.TaskNum.EASY_35;

import com.gmail.ivdanilov96.leetcode.tasks.Task;

@Task(EASY_35)
public class SearchInsertPosition {

  public int searchInsert(int[] nums, int target) {
    int start = 0;
    int end = nums.length - 1;
    while (start <= end) {
      int curr = start + (end - start) / 2;
      if (nums[curr] == target) {
        return curr;
      }
      if (nums[curr] < target) {
        start = curr + 1;

      }
      if (nums[curr] > target) {
        end = curr - 1;
      }
    }
    return start;
  }
}

