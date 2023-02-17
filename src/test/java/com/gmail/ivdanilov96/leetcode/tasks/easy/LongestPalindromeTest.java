package com.gmail.ivdanilov96.leetcode.tasks.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("Task 409. Longest Palindrome")
class LongestPalindromeTest {

  @ParameterizedTest(name = """
      Сase {index}:
      Letters stock: {0};
      Expected max length: {1})
      """)
  @MethodSource("initParameters")
  @DisplayName("Test cases:")
  void longestPalindrome(String stock, int expectedMax) {
    var task = new LongestPalindrome();
    assertEquals(expectedMax, task.longestPalindrome(stock));
    assertEquals(expectedMax, task.longestPalindromeLeetcode(stock));
  }

  private static Stream<Arguments> initParameters() {
    return Stream.of(
        arguments("ccc", 3),
        arguments("abccccdd", 7),
        arguments("a", 1)
    );
  }

}