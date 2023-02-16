package com.gmail.ivdanilov96.leetcode.tasks;

import static com.gmail.ivdanilov96.leetcode.tasks.ProgrammingLang.SQL;

public enum TaskNum {

  EASY_35("https://leetcode.com/problems/search-insert-position"),
  EASY_67("https://leetcode.com/problems/add-binary/"),
  EASY_104("https://leetcode.com/problems/maximum-depth-of-binary-tree/"),
  EASY_824("https://leetcode.com/problems/goat-latin"),
  EASY_290("https://leetcode.com/problems/word-pattern"),
  EASY_392("https://leetcode.com/problems/is-subsequence/"),
  EASY_724("https://leetcode.com/problems/find-pivot-index"),
  EASY_953("https://leetcode.com/problems/verifying-an-alien-dictionary"),
  EASY_989("https://leetcode.com/problems/add-to-array-form-of-integer/"),
  EASY_1047("https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/"),
  EASY_1050(
      "https://leetcode.com/problems/actors-and-directors-who-cooperated-at-least-three-times",
      SQL),
  EASY_1071("https://leetcode.com/problems/greatest-common-divisor-of-strings"),
  EASY_1470("https://leetcode.com/problems/shuffle-the-array"),
  EASY_1480("https://leetcode.com/problems/running-sum-of-1d-array/"),
  EASY_1491(
      "https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary"),
  EASY_1523("https://leetcode.com/problems/count-odd-numbers-in-an-interval-range"),
  EASY_1729("https://leetcode.com/problems/find-followers-count", SQL),
  EASY_1795("https://leetcode.com/problems/rearrange-products-table/", SQL),
  MEDIUM_6("https://leetcode.com/problems/zigzag-conversion"),
  MEDIUM_45("https://leetcode.com/problems/jump-game-ii"),
  MEDIUM_178("https://leetcode.com/problems/rank-scores", SQL),
  MEDIUM_438("https://leetcode.com/problems/find-all-anagrams-in-a-string"),
  MEDIUM_567("https://leetcode.com/problems/permutation-in-string"),
  MEDIUM_608("https://leetcode.com/problems/tree-node", SQL),
  MEDIUM_904("https://leetcode.com/problems/fruit-into-baskets"),
  MEDIUM_1129("https://leetcode.com/problems/shortest-path-with-alternating-colors"),
  MEDIUM_1162("https://leetcode.com/problems/as-far-from-land-as-possible"),
  MEDIUM_2477("https://leetcode.com/problems/minimum-fuel-cost-to-report-to-the-capital/"),
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
