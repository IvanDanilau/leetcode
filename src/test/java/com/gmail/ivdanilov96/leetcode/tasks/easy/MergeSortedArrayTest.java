package com.gmail.ivdanilov96.leetcode.tasks.easy;

import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("Task #88. Merge Sorted Array")
class MergeSortedArrayTest {


  @ParameterizedTest(name = """
      Сase {index}:
      1st array: {0};
      1st array len: {1};
      2nd array: {2};
      2nd array len: {3};
      expected array {4}
      """)
  @MethodSource("initParameters")
  @DisplayName("Test cases:")
  void merge(int[] nums1, int m, int[] nums2, int n, int[] expected) {
    var task = new MergeSortedArray();
    task.merge(nums1, m, nums2, n);
    Assertions.assertArrayEquals(expected, nums1);
  }

  private static Stream<Arguments> initParameters() {
    return Stream.of(
        arguments(new int[]{1, 2, 3, 0, 0, 0}, 3,
            new int[]{2, 5, 6}, 3,
            new int[]{1, 2, 2, 3, 5, 6}),
        arguments(new int[]{1}, 1,
            new int[]{}, 0,
            new int[]{1}),
        arguments(new int[]{0}, 0,
            new int[]{1}, 1,
            new int[]{1})
    );
  }
}