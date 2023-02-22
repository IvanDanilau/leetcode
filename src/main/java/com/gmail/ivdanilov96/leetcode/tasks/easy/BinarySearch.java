package com.gmail.ivdanilov96.leetcode.tasks.easy;

import com.gmail.ivdanilov96.leetcode.tasks.Task;
import com.gmail.ivdanilov96.leetcode.tasks.TaskNum;

@Task(TaskNum.EASY_704)
public class BinarySearch {

  public int search(int[] nums, int target) {
    int start = 0;
    int end = nums.length - 1;
    while (start <= end) {
      int middle = (start + end) / 2;
      if (nums[middle] == target) {
        return middle;
      }
      if (nums[middle] > target) {
        end = middle - 1;
      } else {
        start = middle + 1;
      }
    }
    return -1;
  }

}
