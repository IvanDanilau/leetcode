package com.gmail.ivdanilov96.leetcode.tasks.easy;

import static com.gmail.ivdanilov96.leetcode.tasks.TaskNum.EASY_1047;

import com.gmail.ivdanilov96.leetcode.tasks.Task;
import java.util.Stack;

@Task(EASY_1047)
public class RemoveAllAdjacentDuplicatesInString {

  //TODO could be replaced with StringBuilder
  public String removeDuplicates(String s) {
    Stack<Character> stack = new Stack<>();
    char[] chars = s.toCharArray();
    for (int i = 0; i < chars.length; i++) {
      char symbol = s.charAt(i);
      if (!stack.isEmpty() && stack.peek() == symbol) {
        stack.pop();
      } else {
        stack.push(symbol);
      }
    }
    chars = new char[stack.size()];
    for (int i = chars.length - 1; i >= 0; i--) {
      chars[i] = stack.pop();
    }
    return new String(chars);
  }

}
