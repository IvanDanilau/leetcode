package com.gmail.ivdanilov96.leetcode.tasks.easy;

import static com.gmail.ivdanilov96.leetcode.tasks.TaskNum.EASY_1491;

import com.gmail.ivdanilov96.leetcode.tasks.Task;

@Task(EASY_1491)
public class AverageSalaryExcludingTheMinAndMaxSalary {

  public double average(int[] salary) {
    double total = 0;
    int min = salary[0];
    int max = salary[0];
    for (int sal : salary) {
      min = Math.min(sal, min);
      max = Math.max(sal, max);
      total += sal;
    }
    return (total - (min + max)) / (salary.length - 2);
  }

}
