package com.gmail.ivdanilov96.leetcode.tasks.medium;

import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("Task 904. Fruit Into Baskets")
class FruitIntoBasketsTest {

  @ParameterizedTest(name = """
      Сase {index}:
      Fruits row: {0};
      expect best iteration: {1}")
      """)
  @MethodSource("initParameters")
  @DisplayName("Test cases:")
  void totalFruit(int[] treeRow, int expectedBestIteration) {
    var task = new FruitIntoBaskets();
    Assertions.assertEquals(expectedBestIteration, task.totalFruit(treeRow));
    Assertions.assertEquals(expectedBestIteration, task.totalFruitLeetcode(treeRow));
  }

  private static Stream<Arguments> initParameters() {
    return Stream.of(
        arguments(new int[]{1, 2, 1}, 3),
        arguments(new int[]{0, 0, 0, 0, 0, 0, 1}, 7),
        arguments(new int[]{3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4}, 5),
        arguments(new int[]{0, 1, 6, 6, 4, 4, 6}, 5),
        arguments(new int[]{0, 1, 6, 6, 4, 5, 4, 1, 2, 3, 4}, 3),
        arguments(new int[]{1, 2, 3, 2, 2}, 4),
        arguments(new int[]{0, 1, 2, 2}, 3));

  }
}