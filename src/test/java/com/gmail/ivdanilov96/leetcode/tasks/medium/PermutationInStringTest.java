package com.gmail.ivdanilov96.leetcode.tasks.medium;

import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("Task #567 - Permutation in String")
class PermutationInStringTest {

  @ParameterizedTest
  @MethodSource("initParameters")
  void checkInclusion(String s1, String s2, boolean included) {
    var task = new PermutationInString();
    Assertions.assertEquals(task.checkInclusion(s1, s2), included);
  }

  private static Stream<Arguments> initParameters() {
    return Stream.of(
        arguments("ab", "eidbaooo", true),
        arguments("ab", "eidboaoo", false),
        arguments("adc", "dcda", true),
        arguments("ab", "ab", true),
        arguments("abc", "bbbca", true)
    );
  }
}