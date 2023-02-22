package com.gmail.ivdanilov96.leetcode.tasks.medium;

import com.gmail.ivdanilov96.leetcode.tasks.Task;
import com.gmail.ivdanilov96.leetcode.tasks.TaskNum;

@Task(TaskNum.MEDIUM_1011)
public class CapacityToShipPackagesWithinDDays {

  public int shipWithinDays(int[] weights, int days) {
    int result = 1;
    for (int weight : weights) {
      result = Math.max(result, weight);
    }
    while (true) {
      int currDay = 1;
      int dayWight = 0;
      for (int i = 0; i < weights.length; i++) {
        if (result < dayWight + weights[i]) {
          currDay++;
          dayWight = weights[i];
        } else {
          dayWight += weights[i];
        }
        if (days < currDay) {
          break;
        }
        if (i == weights.length - 1) {
          return result;
        }
      }
      result++;
    }
  }

  public int shipWithinDaysLeetcode(int[] weights, int days) {
    int minCapacity = 0;
    int maxCapacity = 0;
    for (int weight : weights) {
      minCapacity = Math.max(minCapacity, weight);
      maxCapacity += weight;
    }
    while (minCapacity < maxCapacity) {
      int capacity = minCapacity + (maxCapacity - minCapacity) / 2;
      if (enoughCapacity(weights, capacity, days)) {
        maxCapacity = capacity;
      } else {
        minCapacity = capacity + 1;
      }
    }
    return minCapacity;
  }

  private boolean enoughCapacity(int[] weights, int capacity, int days) {
    int currDay = 1;
    int dayWight = 0;
    for (int i = 0; i < weights.length; i++) {
      if (capacity < dayWight + weights[i]) {
        currDay++;
        dayWight = weights[i];
      } else {
        dayWight += weights[i];
      }
      if (days < currDay) {
        break;
      }
      if (i == weights.length - 1) {
        return true;
      }
    }
    return false;
  }

}
