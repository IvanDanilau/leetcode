package com.gmail.ivdanilov96.leetcode.tasks.easy;

import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("Task #1470 - Shuffle The Array")
class ShuffleTheArrayTest {

  @ParameterizedTest
  @MethodSource("inputParameters")
  void caseOne(int[] nums, int len, int[] expected) {
    var task = new ShuffleTheArray();
    Assertions.assertArrayEquals(expected, task.shuffle(nums, len));
  }

  private static Stream<Arguments> inputParameters() {
    return Stream.of(
        arguments(new int[]{1, 2, 3, 4, 4, 3, 2, 1}, 4, new int[]{1, 4, 2, 3, 3, 2, 4, 1}),
        arguments(new int[]{1, 1, 2, 2}, 2, new int[]{1, 2, 1, 2})
    );
  }

}