package com.gmail.ivdanilov96.leetcode.tasks.easy;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("Task 1480. Running Sum of 1d Array")
class RunningSumOfArrayTest {

  @ParameterizedTest(name = """
      Сase {index}:
      Input array: {0};
      Expected sums array: {1})
      """)
  @MethodSource("initParameters")
  @DisplayName("Test cases:")
  void runningSum(int[] inputArray, int[] expectedSums) {
    var task = new RunningSumOfArray();
    assertArrayEquals(expectedSums, task.runningSum(inputArray));
  }

  private static Stream<Arguments> initParameters() {
    return Stream.of(
        arguments(new int[]{1, 2, 3, 4}, new int[]{1, 3, 6, 10}),
        arguments(new int[]{1, 1, 1, 1, 1}, new int[]{1, 2, 3, 4, 5}),
        arguments(new int[]{3, 1, 2, 10, 1}, new int[]{3, 4, 6, 16, 17})
    );
  }
}