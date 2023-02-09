package com.gmail.ivdanilov96.leetcode.tasks;

import static com.gmail.ivdanilov96.leetcode.tasks.ProgrammingLang.SQL;

public enum TaskNum {

  EASY_35("https://leetcode.com/problems/search-insert-position"),
  EASY_953("https://leetcode.com/problems/verifying-an-alien-dictionary"),
  EASY_1050(
      "https://leetcode.com/problems/actors-and-directors-who-cooperated-at-least-three-times",
      SQL),
  EASY_1071("https://leetcode.com/problems/greatest-common-divisor-of-strings"),
  EASY_1470("https://leetcode.com/problems/shuffle-the-array/description"),
  MEDIUM_6("https://leetcode.com/problems/zigzag-conversion"),
  MEDIUM_45("https://leetcode.com/problems/jump-game-ii"),
  MEDIUM_178("https://leetcode.com/problems/rank-scores", SQL),
  MEDIUM_438("https://leetcode.com/problems/find-all-anagrams-in-a-string"),
  MEDIUM_567("https://leetcode.com/problems/permutation-in-string"),
  MEDIUM_608("https://leetcode.com/problems/tree-node", SQL),
  MEDIUM_904("https://leetcode.com/problems/fruit-into-baskets"),
  HARD_42("https://leetcode.com/problems/trapping-rain-water"),
  HARD_185("https://leetcode.com/problems/department-top-three-salaries", SQL),
  HARD_2306("https://leetcode.com/problems/naming-a-company/");

  private final String link;
  private final ProgrammingLang lang;

  TaskNum(String link) {
    this.link = link;
    this.lang = ProgrammingLang.JAVA;
  }

  TaskNum(String link, ProgrammingLang lang) {
    this.link = link;
    this.lang = lang;
  }
}
