package com.gmail.ivdanilov96.leetcode.tasks.hard;

import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("Task 42. Trapping Rain Water")
class TrappingRainWaterTest {

  @ParameterizedTest(name = """
      Сase {index}:
      Height array: {0};
      expect trapping water: {1}")
      """)
  @MethodSource("inputParameters")
  @DisplayName("Test cases")
  void trap(int[] height, int expectedTrapped) {
    var task = new TrappingRainWater();
    Assertions.assertEquals(expectedTrapped, task.trap(height));
  }

  private static Stream<Arguments> inputParameters() {
    return Stream.of(
        arguments(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}, 6),
        arguments(new int[]{4, 2, 0, 3, 2, 5}, 9),
        arguments(new int[]{5, 4, 1, 2}, 1),
        arguments(new int[]{4, 3, 3, 9, 3, 0, 9, 2, 8, 3}, 23));
  }
}