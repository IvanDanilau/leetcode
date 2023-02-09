package com.gmail.ivdanilov96.leetcode.tasks.easy;

import static com.gmail.ivdanilov96.leetcode.tasks.TaskNum.EASY_824;

import com.gmail.ivdanilov96.leetcode.tasks.Task;
import java.util.Set;

@Task(EASY_824)
public class GoatLatin {

  public String toGoatLatin(String sentence) {
    String postfix = "ma";
    Set<Character> vowel = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
    int wordsCount = 1;
    StringBuilder builder = new StringBuilder();
    for (String word : sentence.split(" ")) {
      if (vowel.contains(word.charAt(0))) {
        builder.append(word);
      } else if (word.length() > 1) {
        builder.append(word.substring(1))
            .append(word.charAt(0));
      } else {
        builder.append(word.substring(1))
            .append(word.charAt(0));
      }
      builder.append(postfix)
          .append("a".repeat(wordsCount))
          .append(" ");
      wordsCount++;
    }
    return builder.toString().trim();
  }

}
