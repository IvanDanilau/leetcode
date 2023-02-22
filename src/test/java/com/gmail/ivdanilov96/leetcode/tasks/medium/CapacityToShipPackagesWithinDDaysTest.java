package com.gmail.ivdanilov96.leetcode.tasks.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("Task 1011. Capacity To Ship Packages Within D Days")
class CapacityToShipPackagesWithinDDaysTest {

  @ParameterizedTest(name = """
      Сase {index}:
      Weights: {0};
      days: {1};
      Expected capacity: {2})
      """)
  @MethodSource("initParameters")
  @DisplayName("Test cases:")
  void shipWithinDays(int[] weights, int days, int expectedMinCapacity) {
    var task = new CapacityToShipPackagesWithinDDays();
    assertEquals(expectedMinCapacity, task.shipWithinDays(weights, days));
    assertEquals(expectedMinCapacity, task.shipWithinDaysLeetcode(weights, days));
  }

  private static Stream<Arguments> initParameters() {
    return Stream.of(
        arguments(new int[]{3, 2, 2, 4, 1, 4}, 3, 6),
        arguments(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 5, 15),
        arguments(new int[]{1, 2, 3, 1, 1}, 4, 3)
    );
  }
}