package com.gmail.ivdanilov96.leetcode.tasks.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("Task 540. Single Element in a Sorted Array")
class SingleElementInASortedArrayTest {

  @ParameterizedTest(name = """
      Сase {index}:
      Input sorted array: {0};
      Expected single num: {1};
      """)
  @MethodSource("initParameters")
  @DisplayName("Test cases:")
  void singleNonDuplicate(int[] nums, int expectedNum) {
    var task = new SingleElementInASortedArray();
    assertEquals(expectedNum, task.singleNonDuplicate(nums));
    assertEquals(expectedNum, task.singleNonDuplicateLeetcode(nums));
  }

  private static Stream<Arguments> initParameters() {
    return Stream.of(
        arguments(new int[]{3, 3, 7, 7, 10, 11, 11}, 10),
        arguments(new int[]{1, 1, 2, 3, 3, 4, 4, 8, 8}, 2));
  }

}