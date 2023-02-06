package com.gmail.ivdanilov96.leetcode.tasks.easy;

import com.gmail.ivdanilov96.leetcode.tasks.Task;
import com.gmail.ivdanilov96.leetcode.tasks.TaskNum;

@Task(TaskNum.EASY_1071)
public class GreatestCommonDivisorOfStrings {

  public String gcdOfStrings(String first, String second) {
    int gcd = getGCD(first.length(), second.length());
    String divisor = first.substring(0, gcd);
    if (correctDivisor(first, divisor, gcd) && correctDivisor(second, divisor, gcd)) {
      return divisor;
    }
    return "";
  }

  private int getGCD(int numOne, int numTwo) {
    if (numTwo == 0) {
      return numOne;
    } else {
      return getGCD(numTwo, numOne % numTwo);
    }
  }

  private boolean correctDivisor(String str, String divisor, int gcd) {
    for (int i = 0; i < str.length() / gcd; i++) {
      if (!str.startsWith(divisor, gcd * i)) {
        return false;
      }
    }
    return true;
  }
}


