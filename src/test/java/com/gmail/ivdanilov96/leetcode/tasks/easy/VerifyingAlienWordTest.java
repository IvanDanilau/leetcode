package com.gmail.ivdanilov96.leetcode.tasks.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Task #953 - Verifying Alien Word.")
class VerifyingAlienWordTest {

  @Test
  @DisplayName("Input array =  [\"hello\",\"leetcode\"], order = hlabcdefgijkmnopqrstuvwxyz;  expected = true")
  void caseOne() {
    var task = new VerifyingAlienWord();
    String[] input = {"hello", "leetcode"};
    var order = "hlabcdefgijkmnopqrstuvwxyz";
    Assertions.assertTrue(task.isAlienSorted(input, order));
  }

  @Test
  @DisplayName("Input array =  [\"word\", \"world\", \"row\"], order = worldabcefghijkmnpqstuvxyz;  expected = true")
  void caseTwo() {
    var task = new VerifyingAlienWord();
    String[] input = {"word", "world", "row"};
    var order = "worldabcefghijkmnpqstuvxyz";
    Assertions.assertFalse(task.isAlienSorted(input, order));
  }

  @Test
  @DisplayName("Input array =  [\"apple\", \"app\"], order = abcdefghijklmnopqrstuvwxyz;  expected = true")
  void caseThree() {
    var task = new VerifyingAlienWord();
    String[] input = {"apple", "app"};
    var order = "abcdefghijklmnopqrstuvwxyz";
    Assertions.assertFalse(task.isAlienSorted(input, order));
  }
}