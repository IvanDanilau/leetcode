package com.gmail.ivdanilov96.leetcode.tasks.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("Task 67. Add Binary")
class AddBinaryTest {

  @ParameterizedTest(name = """
      Сase {index}:
      String first: {0};
      String second: {1};
      Expected summary: {2})
      """)
  @MethodSource("initParameters")
  @DisplayName("Test cases:")
  void addBinary(String first, String second, String exprected) {
    var task = new AddBinary();
    assertEquals(exprected, task.addBinary(first, second));
    assertEquals(exprected, task.addBinaryLeetcode(first, second));
  }

  private static Stream<Arguments> initParameters() {
    return Stream.of(
        arguments("11", "1", "100"),
        arguments("0", "0", "0"),
        arguments("1010", "1011", "10101")
    );
  }
}