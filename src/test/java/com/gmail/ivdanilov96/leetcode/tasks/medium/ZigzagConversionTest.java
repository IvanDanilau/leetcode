package com.gmail.ivdanilov96.leetcode.tasks.medium;

import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("Task #6 - Zigzag Conversion")
class ZigzagConversionTest {

  @ParameterizedTest
  @MethodSource("initParameters")
  void convert(String input, int rows, String expected) {
    var task = new ZigzagConversion();
    Assertions.assertEquals(expected, task.convert(input, rows));
  }

  private static Stream<Arguments> initParameters() {
    return Stream.of(
        arguments("PAYPALISHIRING", 4, "PINALSIGYAHRPI"),
        arguments("PAYPALISHIRING", 3, "PAHNAPLSIIGYIR"),
        arguments("AAA", 1, "AAA")
    );
  }
}