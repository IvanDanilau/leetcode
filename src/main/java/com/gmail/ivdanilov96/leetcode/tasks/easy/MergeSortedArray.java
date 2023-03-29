package com.gmail.ivdanilov96.leetcode.tasks.easy;

import com.gmail.ivdanilov96.leetcode.tasks.Task;
import com.gmail.ivdanilov96.leetcode.tasks.TaskNum;

@Task(TaskNum.EASY_88)
public class MergeSortedArray {

  public void merge(int[] nums1, int m, int[] nums2, int n) {
    int lenOne = m - 1;
    int lenTwo = n - 1;
    int curr = nums1.length - 1;
    while (lenTwo >= 0){
      if(lenOne >= 0 && nums1[lenOne] >= nums2[lenTwo]) {
        nums1[curr--] = nums1[lenOne--];
      } else {
        nums1[curr--] = nums2[lenTwo--];
      }
    }
  }

}
