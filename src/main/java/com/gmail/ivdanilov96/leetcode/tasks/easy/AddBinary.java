package com.gmail.ivdanilov96.leetcode.tasks.easy;

import static com.gmail.ivdanilov96.leetcode.tasks.TaskNum.EASY_67;

import com.gmail.ivdanilov96.leetcode.tasks.Task;

@Task(EASY_67)
public class AddBinary {

  public String addBinary(String a, String b) {
    int maxLength = Math.max(a.length(), b.length());
    String reverseOne = new StringBuilder(a).reverse()
        .append("0".repeat(maxLength - a.length())).toString();
    String reverseTwo = new StringBuilder(b).reverse()
        .append("0".repeat(maxLength - b.length())).toString();

    StringBuilder result = new StringBuilder();
    int next = 0;
    for (int i = 0; i < maxLength; i++) {
      int n1 = reverseOne.charAt(i) - '0';
      int n2 = reverseTwo.charAt(i) - '0';
      int tempSum = n1 + n2 + next;
      result.append(tempSum % 2);
      next = tempSum / 2;
    }
    if (next != 0) {
      result.append(next);
    }
    return result.reverse().toString();
  }

  public String addBinaryLeetcode(String a, String b) {
    int aLength = a.length();
    int bLength = b.length();
    StringBuilder sb = new StringBuilder();
    int carry = 0;
    while (Math.max(aLength, bLength) > 0) {
      int aNum = aLength > 0 ? (a.charAt(aLength-- - 1) - '0') : 0;
      int bNum = bLength > 0 ? (b.charAt(bLength-- - 1) - '0') : 0;
      int cNum = aNum + bNum + carry;
      sb.append(cNum % 2);
      carry = cNum / 2;
    }
    return (carry == 1) ? sb.append(1).reverse().toString() : sb.reverse().toString();
  }


}
