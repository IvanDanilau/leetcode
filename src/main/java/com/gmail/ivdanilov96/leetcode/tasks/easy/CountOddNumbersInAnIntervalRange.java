package com.gmail.ivdanilov96.leetcode.tasks.easy;

import static com.gmail.ivdanilov96.leetcode.tasks.TaskNum.EASY_1523;

import com.gmail.ivdanilov96.leetcode.tasks.Task;

@Task(EASY_1523)
public class CountOddNumbersInAnIntervalRange {


  public int countOdds(int low, int high) {
    if (low % 2 == 1) low--;
    if (high % 2 == 1) high++;
    return (high - low) / 2;
  }

}
