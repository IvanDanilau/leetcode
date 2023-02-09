package com.gmail.ivdanilov96.leetcode.tasks.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MostFrequentEvenElementTest {

  @Test
  void mostFrequentEven() {
    var task = new MostFrequentEvenElement();
    Assertions.assertEquals(2, task.mostFrequentEven(new int[]{0, 1, 2, 2, 4, 4, 1}));
    Assertions.assertEquals(1000, task.mostFrequentEven(new int[]{1000}));
  }
}