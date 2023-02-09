package com.gmail.ivdanilov96.leetcode.tasks.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("Task 35. Search Insert Position")
class SearchInsertPositionTest {

  @ParameterizedTest(name = """
      Сase {index}:
      Array: {0};
      target: {1};
      expect index: {2}")
      """)
  @MethodSource("inputParameters")
  @DisplayName("Test cases:")
  void searchInsert(int[] nums, int target, int expected) {
    var task = new SearchInsertPosition();
    assertEquals(expected, task.searchInsert(nums, target));
  }

  private static Stream<Arguments> inputParameters() {
    return Stream.of(
        arguments(new int[]{1, 3, 5, 6}, 2, 1),
        arguments(new int[]{1, 3, 5, 6}, 0, 0),
        arguments(new int[]{1, 3, 5, 6}, 5, 2),
        arguments(new int[]{1, 3, 5, 6}, 7, 4));
  }

}