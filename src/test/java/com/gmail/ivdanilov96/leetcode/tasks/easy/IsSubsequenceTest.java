package com.gmail.ivdanilov96.leetcode.tasks.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("Task 392. Is Subsequence")
class IsSubsequenceTest {

  @ParameterizedTest(name = """
      Сase {index}:
      target substring: {0};
      Full string: {1};
      contains: {2})
      """)
  @MethodSource("initParameters")
  @DisplayName("Test cases:")
  void isSubsequence(String substring, String fullString, boolean contains) {
    var task = new IsSubsequence();
    assertEquals(contains, task.isSubsequence(substring, fullString));
  }

  private static Stream<Arguments> initParameters() {
    return Stream.of(
        arguments("acb", "ahbgdc", false),
        arguments("abc", "ahbgdc", true),
        arguments("axc", "ahbgdc", false),
        arguments("b", "c", false)
    );
  }
}