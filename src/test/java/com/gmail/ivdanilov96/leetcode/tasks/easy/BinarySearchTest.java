package com.gmail.ivdanilov96.leetcode.tasks.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("Task 704 Binary Search")
class BinarySearchTest {

  @ParameterizedTest(name = """
      Сase {index}:
      Input array: {0};
      Searching num: {1};
      Expected index: {2})
      """)
  @MethodSource("initParameters")
  @DisplayName("Test cases:")
  void search(int[] array, int target, int index) {
    var task = new BinarySearch();
    assertEquals(index, task.search(array, target));
  }

  private static Stream<Arguments> initParameters() {
    return Stream.of(
        arguments(new int[]{5}, 5, 0),
        arguments(new int[]{-1, 0, 3, 5, 9, 12}, 9, 4)
    );
  }
}