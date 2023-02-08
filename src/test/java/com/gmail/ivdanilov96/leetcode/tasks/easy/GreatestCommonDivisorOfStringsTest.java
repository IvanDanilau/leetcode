package com.gmail.ivdanilov96.leetcode.tasks.easy;

import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("Task #1071 - Greatest Common Divisor of Strings")
class GreatestCommonDivisorOfStringsTest {

  @ParameterizedTest(name = """
      Сase {index}:
      First string: {0};
      Second string: {1};
      expect greatest divisor: {2}")
      """)
  @MethodSource("initParameters")
  @DisplayName("Test cases:")
  void gcdOfStrings(String strOne, String strTwo, String expected) {
    var task = new GreatestCommonDivisorOfStrings();
    Assertions.assertEquals(expected, task.gcdOfStrings(strOne, strTwo));
  }

  private static Stream<Arguments> initParameters() {
    return Stream.of(
        arguments("ABCABC", "ABC", "ABC"),
        arguments("ABABAB", "ABAB", "AB"),
        arguments("LEET", "CODE", "")
    );
  }
}