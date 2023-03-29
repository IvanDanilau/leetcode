package com.gmail.ivdanilov96.leetcode.tasks.hard;

import com.gmail.ivdanilov96.leetcode.tasks.Task;
import com.gmail.ivdanilov96.leetcode.tasks.TaskNum;
import java.util.Arrays;
@Task(TaskNum.HARD_1402)
public class ReducingDishes {

    public int maxSatisfaction(int[] satisfaction) {
      int positiveStep = 0;
      int result = 0;
      Arrays.sort(satisfaction);
      for (int i = satisfaction.length - 1;  i >= 0 && satisfaction[i] + positiveStep >= 0; i--) {
        positiveStep += satisfaction[i];
        result += positiveStep;
      }
      return result;
    }

}
