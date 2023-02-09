package com.gmail.ivdanilov96.leetcode.tasks.hard;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("Task 2306. Naming a Company")
class NamingACompanyTest {

  @ParameterizedTest(name = """
      Сase {index}:
      ideas {0};
      expect new combinations count: {1}")
      """)
  @MethodSource("inputParameters")
  @DisplayName("Test cases:")
  void distinctNames(String[] ideas, long expectedCombo) {
    var task = new NamingACompany();
    assertEquals(expectedCombo, task.distinctNames(ideas));
    assertEquals(expectedCombo, task.brutForce(ideas));

  }

  private static Stream<Arguments> inputParameters() {
    return Stream.of(
        arguments(new String[]{"coffee", "donuts", "time", "toffee"}, 6),
        arguments(new String[]{"lack", "back"}, 0)
    );
  }
}