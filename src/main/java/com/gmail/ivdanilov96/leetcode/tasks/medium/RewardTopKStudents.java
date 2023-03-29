package com.gmail.ivdanilov96.leetcode.tasks.medium;

import com.gmail.ivdanilov96.leetcode.tasks.Task;
import com.gmail.ivdanilov96.leetcode.tasks.TaskNum;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

@Task(TaskNum.MEDIUM_2512)
public class RewardTopKStudents {

  public List<Integer> topStudents(String[] positiveFB, String[] negativeFB,
      String[] report, int[] studentId, int k) {
    Map<Integer, Integer> scores = new HashMap<>();
    Set<String> positive = Arrays.stream(positiveFB).collect(Collectors.toSet());
    Set<String> negative = Arrays.stream(negativeFB).collect(Collectors.toSet());
    for (int index = 0; index < report.length; index++) {
      String phase = report[index];
      int points = 0;
      for (String word : phase.split(" ")) {
        if (positive.contains(word)) {
          points += 3;
        }
        if (negative.contains(word)) {
          points--;
        }
      }
      scores.put(studentId[index], scores.getOrDefault(studentId[index], 0) + points);
    }
    record Student(int id, int score) {

    }
    return scores.entrySet().stream()
        .map(entry -> new Student(entry.getKey(), entry.getValue()))
        .sorted(Comparator.comparingInt(Student::score).reversed()
            .thenComparing(Student::id))
        .limit(k)
        .map(Student::id)
        .toList();
  }

}
