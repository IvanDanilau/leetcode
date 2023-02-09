package com.gmail.ivdanilov96.leetcode.tasks.medium;

import com.gmail.ivdanilov96.leetcode.tasks.Task;
import com.gmail.ivdanilov96.leetcode.tasks.TaskNum;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
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

  public int totalFruitLeetcode(int[] fruits) {
    int max = 0;
    int left = 0;
    Map<Integer, Integer> fruitsStock = new HashMap<>();
    for (int i = 0; i < fruits.length; i++) {
      int count = fruitsStock.getOrDefault(fruits[i], 0) + 1;
      fruitsStock.put(fruits[i], count);
      while (fruitsStock.size() > 2) {
        int leftCount = fruitsStock.get(fruits[left]) - 1;
        if (leftCount == 0) {
          fruitsStock.remove(fruits[left]);
        } else {
          fruitsStock.put(fruits[left], leftCount);
        }
        left++;
      }
      max = Math.max(max, i - left + 1);
    }
    return max;
  }

}