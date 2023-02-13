package com.gmail.ivdanilov96.leetcode.tasks.easy;

import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("Task 1523. Count Odd Numbers in an Interval Range")
class CountOddNumbersInAnIntervalRangeTest {

  @ParameterizedTest(name = """
      Сase {index}:
      Low num: {0};
      High num: {1};
      expected odds num: {2}")
      """)
  @MethodSource("initParameters")
  @DisplayName("Test cases:")
  void countOdds(int low, int high, int expectedOdds) {
    var task = new CountOddNumbersInAnIntervalRange();
    Assertions.assertEquals(expectedOdds, task.countOdds(low, high));
  }

  public static Stream<Arguments> initParameters() {
    return Stream.of(
        arguments(3, 7, 3),
        arguments(8, 10, 1)
    );
  }
}