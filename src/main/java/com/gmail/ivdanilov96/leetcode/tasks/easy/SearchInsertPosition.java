package com.gmail.ivdanilov96.leetcode.tasks.easy;

import static com.gmail.ivdanilov96.leetcode.tasks.TaskNum.EASY_35;

import com.gmail.ivdanilov96.leetcode.tasks.Task;
import java.util.Arrays;

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
      if (nums[curr] > target) {
        end = curr - 1;
      } else {
        start = curr + 1;
      }
    }
    return start;
  }

  public int searchInsertRecursion(int[] nums, int target, int first) {
    if (nums.length != 0) {
      int curr = (nums.length - 1) / 2;
      if (nums[curr] == target) {
        return curr + first;
      }
      if (nums[curr] > target) {
        int[] subarray = Arrays.copyOfRange(nums, 0, curr);
        return searchInsertRecursion(subarray, target, first);
      } else {
        first += curr + 1;
        int[] subarray = Arrays.copyOfRange(nums, curr + 1, nums.length);
        return searchInsertRecursion(subarray, target, first);
      }
    }
    return first;
  }
}

