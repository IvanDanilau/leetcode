package com.gmail.ivdanilov96.leetcode.tasks.easy;

import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("Task 989. Add to Array-Form of Integer")
class AddToArrayFormOfIntegerTest {

  @ParameterizedTest(name = """
      Сase {index}:
      First num: {0};
      Second num: {1};
      Expected sum: {2})
      """)
  @MethodSource("initParameters")
  @DisplayName("Test cases:")
  void addToArrayForm(int[] numOne, int numTwo, List<Integer> expected) {
    var task = new AddToArrayFormOfInteger();
    List<Integer> answer = task.addToArrayForm(numOne, numTwo);
    Assertions.assertEquals(answer, expected);
  }

  private static Stream<Arguments> initParameters() {
    return Stream.of(
        arguments(new int[]{0}, 10000, List.of(1, 0, 0, 0, 0)),
        arguments(new int[]{2, 1, 5}, 806, List.of(1, 0, 2, 1)),
        arguments(new int[]{1, 2, 0, 0}, 34, List.of(1, 2, 3, 4))
    );
  }
}