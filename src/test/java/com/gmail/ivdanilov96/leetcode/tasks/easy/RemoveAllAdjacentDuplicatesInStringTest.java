package com.gmail.ivdanilov96.leetcode.tasks.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("Task 1047. Remove All Adjacent Duplicates In String")
class RemoveAllAdjacentDuplicatesInStringTest {

  @ParameterizedTest(name = """
      Сase {index}:
      Source string: {0};
      After duplicate removing: {1})
      """)
  @MethodSource("initParameters")
  @DisplayName("Test cases:")
  void removeDuplicates(String source, String expected) {
    var task = new RemoveAllAdjacentDuplicatesInString();
    assertEquals(expected, task.removeDuplicates(source));
  }

  private static Stream<Arguments> initParameters() {
    return Stream.of(
        arguments("aababaab", "ba"),
        arguments("abbaca", "ca"),
        arguments("azxxzy", "ay"));
  }

}