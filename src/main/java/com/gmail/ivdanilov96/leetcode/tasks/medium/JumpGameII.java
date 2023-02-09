package com.gmail.ivdanilov96.leetcode.tasks.medium;

import com.gmail.ivdanilov96.leetcode.tasks.Task;
import com.gmail.ivdanilov96.leetcode.tasks.TaskNum;

@Task(TaskNum.MEDIUM_45)
public class JumpGameII {

  //Brut_force
  public int jump(int[] nums) {
    int jumpsCount = 0;
    for (int i = 0; i < nums.length - 1; ) {
      jumpsCount++;
      int jumps = nums[i];
      int effectiveJump = jumps;
      int nextJump = i + 1;
      for (int j = 1; j <= jumps; j++) {
        if (i + j >= nums.length - 1) {
          return jumpsCount;
        }
        if (effectiveJump < jumps + nums[i + j] + j) {
          effectiveJump = jumps + nums[i + j] + j;
          nextJump = i + j;
        }
      }
      i = nextJump;
    }
    return jumpsCount;
  }

  //after researching
  public int jumpAfterLeetcode(int[] nums) {
    int iterations = 0;
    int curr = 0;
    int next = 0;
    for (int i = 0; i < nums.length - 1; i++) {
      next = Math.max(next, nums[i] + i);
      if (i == curr) {
        iterations++;
        curr = next;
      }
    }
    return iterations;
  }

}

