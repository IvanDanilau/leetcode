package com.gmail.ivdanilov96.leetcode.tasks.medium;

import com.gmail.ivdanilov96.leetcode.tasks.Task;
import com.gmail.ivdanilov96.leetcode.tasks.TaskNum;
import java.util.HashSet;
import java.util.Set;

@Task(TaskNum.MEDIUM_299)
public class BullsAndCows {

  public String getHint(String secret, String guess) {
    int[] cowsMap = new int[10];
    int cows = 0;
    Set<Integer> bulls = new HashSet<>();
    for (int i = 0; i < secret.toCharArray().length; i++) {
      if (secret.charAt(i) == guess.charAt(i)) {
        bulls.add(i);
      } else {
        cowsMap[secret.charAt(i) - '0']++;
      }
    }
    for (int i = 0; i < secret.toCharArray().length; i++) {
      if (!bulls.contains(i) && cowsMap[guess.charAt(i) - '0'] > 0) {
        cowsMap[guess.charAt(i) - '0']--;
        cows++;
      }
    }
    return String.format("%dA%dB", bulls.size(), cows);
  }

  public String getHintLeetcode(String secret, String guess) {
    int bulls = 0;
    int cows = 0;
    int[] numbers = new int[10];
    for (int i = 0; i < secret.length(); i++) {
      if (secret.charAt(i) == guess.charAt(i)) {
        bulls++;
      } else {
        if (numbers[secret.charAt(i) - '0']++ < 0) {
          cows++;
        }
        if (numbers[guess.charAt(i) - '0']-- > 0) {
          cows++;
        }
      }
    }
    return bulls + "A" + cows + "B";
  }
}
