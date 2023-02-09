package com.gmail.ivdanilov96.leetcode.tasks.hard;

import com.gmail.ivdanilov96.leetcode.tasks.Task;
import com.gmail.ivdanilov96.leetcode.tasks.TaskNum;

@Task(TaskNum.HARD_42)
public class TrappingRainWater {

  //[0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1]
  //[0, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3]
  //[3, 3, 3, 3, 3, 3, 3, 3, 2, 2, 2, 1]
  //[0, 0  2  0  1  2  1  0  0  1  0  0
  public int trap(int[] height) {
    int answer = 0;
    int[] right = new int[height.length];
    int[] left = new int[height.length];
    right[height.length - 1] = height[height.length - 1];
    left[0] = height[0];
    for (int i = right.length - 1; i > 0; i--) {
      right[i - 1] = Math.max(right[i], height[i - 1]);
    }
    for (int i = 0; i < height.length - 1; i++) {
      left[i + 1] = Math.max(left[i], height[i + 1]);
      int water = Math.min(left[i], right[i]) - height[i];
      if (water > 0) {
        answer += water;
      }
    }
    return answer;
  }

}
