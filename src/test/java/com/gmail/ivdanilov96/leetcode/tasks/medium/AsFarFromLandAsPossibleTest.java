package com.gmail.ivdanilov96.leetcode.tasks.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("Task 1162. As Far from Land as Possible")
class AsFarFromLandAsPossibleTest {

  @ParameterizedTest(name = """
      Сase {index}:
      Land matrix: {0};
      expect max distance: {1}")
      """)
  @MethodSource("inputParameters")
  @DisplayName("Test cases:")
  void maxDistance(int[][] grid, int expectedMax) {
    var task = new AsFarFromLandAsPossible();
    assertEquals(expectedMax, task.maxDistance(grid));
  }

  private static Stream<Arguments> inputParameters() {
    return Stream.of(
        arguments(new int[][]{{1, 0, 1}, {0, 0, 0}, {1, 0, 1}}, 2),
        arguments(new int[][]{{1, 0, 0}, {0, 0, 0}, {0, 0, 0}}, 4)
    );
  }


}