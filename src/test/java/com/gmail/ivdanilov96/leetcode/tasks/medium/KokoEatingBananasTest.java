package com.gmail.ivdanilov96.leetcode.tasks.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("Task 875. Koko Eating Bananas")
class KokoEatingBananasTest {

  @ParameterizedTest(name = """
      Сase {index}:
      Piles: {0};
      Hours without security: {1};
      Expected min eating speed: {2})
      """)
  @MethodSource("initParameters")
  @DisplayName("Test cases:")
  void minEatingSpeed(int[] piles, int hours, int expectedSpeed) {
    var task = new KokoEatingBananas();
    assertEquals(expectedSpeed, task.minEatingSpeed(piles, hours));
  }

  private static Stream<Arguments> initParameters() {
    return Stream.of(
        arguments(new int[]{805306368, 805306368, 805306368}, 1000000000, 3),
        arguments(new int[]{3, 6, 7, 11}, 8, 4),
        arguments(new int[]{30, 11, 23, 4, 20}, 5, 30),
        arguments(new int[]{30, 11, 23, 4, 20}, 6, 23)
    );
  }
}