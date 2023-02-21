package com.gmail.ivdanilov96.leetcode.tasks.medium;

import com.gmail.ivdanilov96.leetcode.tasks.Task;
import com.gmail.ivdanilov96.leetcode.tasks.TaskNum;
import java.util.Arrays;

@Task(TaskNum.MEDIUM_540)
public class SingleElementInASortedArray {


  public int singleNonDuplicate(int[] nums) {
    if (nums.length == 1) {
      return nums[0];
    } else {
      int middle = (nums.length - 1) / 2;
      int curr = nums[middle];
      int prev = nums[middle - 1];
      if (middle % 2 == 1) {
        if (prev == curr) {
          int[] arr = Arrays.copyOfRange(nums, middle + 1, nums.length);
          return singleNonDuplicate(arr);
        } else {
          int[] arr = Arrays.copyOfRange(nums, 0, middle);
          return singleNonDuplicate(arr);
        }
      } else {
        if (prev != curr) {
          int[] arr = Arrays.copyOfRange(nums, middle, nums.length);
          return singleNonDuplicate(arr);
        } else {
          int[] arr = Arrays.copyOfRange(nums, 0, middle + 1);
          return singleNonDuplicate(arr);
        }
      }
    }
  }

  public int singleNonDuplicateLeetcode(int[] nums) {
    int left = 0;
    int right = nums.length - 1;
    while (left < right) {
      int mid = (left + right) / 2;
      if ((mid % 2 == 0 && nums[mid] == nums[mid + 1])
          || (mid % 2 == 1 && nums[mid] == nums[mid - 1])) {
        left = mid + 1;
      } else {
        right = mid;
      }
    }
    return nums[left];
  }
}
