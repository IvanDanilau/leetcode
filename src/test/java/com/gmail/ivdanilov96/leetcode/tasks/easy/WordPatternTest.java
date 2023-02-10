package com.gmail.ivdanilov96.leetcode.tasks.easy;

import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("Task 290. Word Pattern")
class WordPatternTest {

  @ParameterizedTest(name = """
      Сase {index}:
      pattern {0};
      words: {1}",
      match pattern {2})
      """)
  @MethodSource("inputParameters")
  @DisplayName("Test cases:")
  void wordPattern(String pattern, String words, boolean match) {
    var task = new WordPattern();
    Assertions.assertEquals(match, task.wordPattern(pattern, words));
  }

  private static Stream<Arguments> inputParameters() {
    return Stream.of(
        arguments("abba", "dog dog dog dog", false),
        arguments("abba", "dog cat cat dog", true),
        arguments("abba", "dog cat cat fish", false),
        arguments("aaaa", "dog cat cat dog", false),
        arguments("abbac", "dog cat cat fish", "fish", false)
    );
  }
}