package com.gmail.ivdanilov96.leetcode.tasks.easy;

import static com.gmail.ivdanilov96.leetcode.tasks.TaskNum.EASY_989;

import com.gmail.ivdanilov96.leetcode.tasks.Task;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Task(EASY_989)
public class AddToArrayFormOfInteger {

  public List<Integer> addToArrayForm(int[] num, int k) {
    ArrayList<Integer> result = new ArrayList<>();
    for (int i = num.length - 1; i >= 0; i--) {
      k += num[i];
      result.add((k) % 10);
      k /= 10;
    }
    while (k > 0) {
      result.add(k % 10);
      k /= 10;
    }
    Collections.reverse(result);
    return result;
  }

}
