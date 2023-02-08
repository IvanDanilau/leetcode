package com.gmail.ivdanilov96.leetcode.tasks.medium;

import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("Task #45 - Jump Game II")
class JumpGameIITest {

  @ParameterizedTest(name = """
      Сase {index}:
      Num array: {0};
      expect min jumps: {1}")
      """)
  @MethodSource("initParameters")
  @DisplayName("Test cases:")
  void jump(int[] array, int expectedJumps) {
    var task = new JumpGameII();
    Assertions.assertEquals(expectedJumps, task.jump(array));
    Assertions.assertEquals(expectedJumps, task.jumpAfterLeetcode(array));

  }

  private static Stream<Arguments> initParameters() {
    return Stream.of(
        arguments(new int[]{1, 2, 1, 1, 1}, 3),
        arguments(new int[]{2, 3, 1}, 1),
        arguments(new int[]{2, 1}, 1),
        arguments(new int[]{0}, 0),
        arguments(new int[]{2, 3, 1, 1, 4}, 2),
        arguments(new int[]{2, 3, 0, 1, 4}, 2)
    );
  }

}