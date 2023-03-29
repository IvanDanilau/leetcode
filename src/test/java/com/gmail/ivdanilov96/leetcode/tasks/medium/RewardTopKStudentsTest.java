package com.gmail.ivdanilov96.leetcode.tasks.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("Task 2512. Reward Top K Students")
class RewardTopKStudentsTest {

  @ParameterizedTest(name = """
      Сase {index}:
      Positive words: {0};
      Negative words: {1};
      Reports: {2};
      Students: {3};
      Top k: {4};
      Expected students: {5})
      """)
  @MethodSource("initParameters")
  @DisplayName("Test cases:")
  void topStudents(String[] positiveFB, String[] negativeFB,
      String[] report, int[] studentId, int k, int[] answer) {
    var task = new RewardTopKStudents();
    List<Integer> result = task.topStudents(positiveFB, negativeFB, report, studentId, k);
    assertEquals(answer.length, result.size());
    for (int i = 0; i < result.size(); i++) {
      Assertions.assertEquals(result.get(i), answer[i]);
    }
  }

  private static Stream<Arguments> initParameters() {
    return Stream.of(
        arguments(new String[]{"smart", "brilliant", "studious"},
            new String[]{"not"},
            new String[]{"this student is studious", "the student is smart"},
            new int[]{1, 2}, 2,
            new int[]{1, 2}),

        arguments(new String[]{"smart", "brilliant", "studious"},
            new String[]{"not"},
            new String[]{"this student is not studious", "the student is smart"},
            new int[]{1, 2}, 2,
            new int[]{2, 1})
    );
  }
}