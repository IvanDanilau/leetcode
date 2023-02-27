package com.gmail.ivdanilov96.leetcode.tasks.medium;

import static com.gmail.ivdanilov96.leetcode.tasks.TaskNum.MEDIUM_692;

import com.gmail.ivdanilov96.leetcode.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

@Task(MEDIUM_692)
public class TopKFrequentWords {

  public List<String> topKFrequent(String[] words, int k) {
    Map<String, Integer> count = new HashMap<>();
    for (String word : words) {
      count.put(word, count.getOrDefault(word, 0) + 1);
    }
    PriorityQueue<Pair> prior = new PriorityQueue<>(count.size(),
        (o1, o2) -> {
          int i = o2.occurrence - o1.occurrence;
          if (i != 0) {
            return i;
          } else {
            return o1.word.compareTo(o2.word);
          }
        });
    for (String word : count.keySet()) {
      prior.add(new Pair(word, count.get(word)));
    }
    List<String> res = new ArrayList<>();
    while (res.size() < k) {
      res.add(prior.poll().word);
    }
    return res;
  }

  class Pair {

    String word;
    int occurrence;

    public Pair(String word, Integer occurrence) {
      this.word = word;
      this.occurrence = occurrence;
    }
  }
}
