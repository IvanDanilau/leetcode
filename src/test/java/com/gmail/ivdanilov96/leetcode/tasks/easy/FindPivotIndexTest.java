package com.gmail.ivdanilov96.leetcode.tasks.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("Task 724. Find Pivot Index")
class FindPivotIndexTest {

  @ParameterizedTest(name = """
      Сase {index}:
      Input num array: {0};
      Expected index: {1})
      """)
  @MethodSource("initParameters")
  @DisplayName("Test cases:")
  void pivotIndex(int[] numArray, int expectedIndex) {
    var task = new FindPivotIndex();
    assertEquals(task.pivotIndex(numArray), expectedIndex);
  }

  private static Stream<Arguments> initParameters() {
    return Stream.of(
        arguments(new int[]{1, 7, 3, 6, 5, 6}, 3),
        arguments(new int[]{1, 2, 3}, -1),
        arguments(new int[]{2, 1, -1}, 0)
    );
  }
}