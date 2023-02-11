package com.gmail.ivdanilov96.leetcode.tasks.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("Task 1491. Average Salary Excluding the Minimum and Maximum Salary")
class AverageSalaryExcludingTheMinAndMaxSalaryTest {

  @ParameterizedTest(name = """
      Сase {index}:
      Salaries: {0};
      Expected average: {1})
      """)
  @MethodSource("initParameters")
  @DisplayName("Test cases:")
  void average(int[] salaries, double average) {
    var task = new AverageSalaryExcludingTheMinAndMaxSalary();
    assertEquals(average, task.average(salaries));
  }

  private static Stream<Arguments> initParameters() {
    return Stream.of(
        arguments(new int[]{4000, 3000, 1000, 2000}, 2500.000),
        arguments(new int[]{1000, 2000, 3000}, 2000.000)
    );
  }
}