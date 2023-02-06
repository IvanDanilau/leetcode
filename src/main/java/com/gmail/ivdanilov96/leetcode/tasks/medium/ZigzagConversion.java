package com.gmail.ivdanilov96.leetcode.tasks.medium;

import com.gmail.ivdanilov96.leetcode.tasks.Task;
import com.gmail.ivdanilov96.leetcode.tasks.TaskNum;

@Task(TaskNum.MEDIUM_6)
public class ZigzagConversion {


  public String convert(String s, int numRows) {
    if (numRows == 1) {
      return s;
    }
    int length = s.length();
    var builder = new StringBuilder();
    for (int rowNum = 0; rowNum < numRows; rowNum++) {
      int nextstep = rowNum;
      while (nextstep < length) {
        builder.append(s.charAt(nextstep));
        if (rowNum != 0 && rowNum != numRows - 1) {
          int intervalCell = nextstep + (numRows - (rowNum + 1)) * 2;
          if (intervalCell < length) {
            builder.append(s.charAt(intervalCell));
          }
        }
        nextstep += numRows + numRows - 2;
      }
    }
    return builder.toString();
  }
}

