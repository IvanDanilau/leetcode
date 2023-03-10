package com.gmail.ivdanilov96.leetcode.tasks.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("Task 125. Valid Palindrome")
class ValidPalidromeTest {

  @ParameterizedTest(name = """
      Сase {index}:
      String input: {0};
      Expected is palindrome : {1})""")
  @MethodSource("initParameters")
  @DisplayName("Test cases:")
  void isPalindrome(String input, boolean isPalindrome) {
    var task = new ValidPalidrome();
    assertEquals(isPalindrome, task.isPalindrome(input));
  }

  private static Stream<Arguments> initParameters() {
    return Stream.of(
        arguments("A man, a plan, a canal: Panama", true),
        arguments("race a car", false),
        arguments(" ", true));
  }
}