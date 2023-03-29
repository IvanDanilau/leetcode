package com.gmail.ivdanilov96.leetcode.tasks.hard;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("Task 1402. Reducing Dishes")
class ReducingDishesTest {

  @ParameterizedTest(name = """
      Сase {index}:
      Dishes array: {0};
      Expected max: {1})
      """)
  @MethodSource("initParameters")
  @DisplayName("Test cases:")
  void maxSatisfaction(int[] satisfaction, int expectedMax) {
    var task = new ReducingDishes();
    assertEquals(expectedMax, task.maxSatisfaction(satisfaction));
  }

  private static Stream<Arguments> initParameters() {
    return Stream.of(
        arguments(new int[]{-1, -8, 0, 5, -9}, 14),
        arguments(new int[]{4, 3, 2}, 20),
        arguments(new int[]{-1, -8, -3}, 0)
    );
  }

}