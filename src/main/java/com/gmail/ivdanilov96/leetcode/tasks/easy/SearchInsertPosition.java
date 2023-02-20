package com.gmail.ivdanilov96.leetcode.tasks.easy;

import static com.gmail.ivdanilov96.leetcode.tasks.TaskNum.EASY_35;

import com.gmail.ivdanilov96.leetcode.tasks.Task;
import java.util.Arrays;

@Task(EASY_35)
public class SearchInsertPosition {

  public int searchInsertRecursion(int[] nums, int target, int start) {
    if (nums.length != 0) {
      int curr = (nums.length - 1) / 2;
      if (nums[curr] == target) {
        return curr + start;
      }
      int[] subArray;
      if (target > nums[curr]) {
        start += curr + 1;
        subArray = Arrays.copyOfRange(nums, curr + 1, nums.length);
      } else {
        subArray = Arrays.copyOfRange(nums, 0, curr);
      }
      return searchInsertRecursion(subArray, target, start);

    }
    return start;
  }

  public int searchInsert(int[] nums, int target) {
    int start = 0;
    int end = nums.length - 1;
    while (start <= end) {
      int curr = (start + end) / 2;
      if (nums[curr] == target) {
        return curr;
      }
      if (target > nums[curr]) {
        start = curr + 1;
      } else {
        end = curr - 1;
      }
    }
    return start;
  }
}
