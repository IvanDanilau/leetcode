package com.gmail.ivdanilov96.leetcode.tasks.medium;

import com.gmail.ivdanilov96.leetcode.tasks.Task;
import com.gmail.ivdanilov96.leetcode.tasks.TaskNum;
import java.util.HashSet;
import java.util.Set;
@Task(TaskNum.MEDIUM_904)
public class FruitIntoBaskets {

  public int totalFruit(int[] fruits) {
    int border = -1;
    int maxIteration = 0;
    Set<Integer> stock = new HashSet<>();
    for (int i = 0; i < fruits.length; i++) {
      stock.add(fruits[i]);
      if (stock.size() > 2) {
        border = i - 1;
        int left = fruits[border];
        while (fruits[border] == left) {
          border--;
        }
        stock.remove(fruits[border]);
      }
      maxIteration = Math.max(i - border, maxIteration);
    }
    return maxIteration;
  }
}