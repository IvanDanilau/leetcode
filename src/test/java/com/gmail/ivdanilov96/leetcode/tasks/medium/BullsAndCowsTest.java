package com.gmail.ivdanilov96.leetcode.tasks.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("Task 299. Bulls and Cows")
class BullsAndCowsTest {

  @ParameterizedTest(name = """
      Case {index}:
      Secret: {0};
      Guess: {1};
      Expected hint: {2})
      """)
  @MethodSource("initParameters")
  @DisplayName("Test cases:")
  void getHint(String secret, String guess, String hint) {
    var task = new BullsAndCows();
    assertEquals(hint, task.getHint(secret, guess));
    assertEquals(hint, task.getHintLeetcode(secret, guess));
  }

  private static Stream<Arguments> initParameters() {
    return Stream.of(
        arguments("1807", "7810", "1A3B"),
        arguments("1123", "0111", "1A1B")
    );
  }


}