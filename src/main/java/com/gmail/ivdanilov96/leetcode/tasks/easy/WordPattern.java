package com.gmail.ivdanilov96.leetcode.tasks.easy;

import static com.gmail.ivdanilov96.leetcode.tasks.TaskNum.EASY_290;

import com.gmail.ivdanilov96.leetcode.tasks.Task;
import java.util.HashMap;

@Task(EASY_290)
public class WordPattern {

  public boolean wordPattern(String pattern, String s) {
    String[] words = s.split(" ");
    if (pattern.length() != words.length) {
      return false;
    }
    HashMap<Integer, String> matches = new HashMap<>();)
    for (int i = 0; i < words.length; i++) {
      String word = words[i];
      int index = pattern.charAt(i) - 'a';
      String match = matches.getOrDefault(index, "");
      if ((!match.isEmpty() && !match.equals(word))
          || (match.isEmpty() && matches.containsValue(word))) {
        return false;
      }
      matches.put(index, word);
    }
    return true;
  }

}
