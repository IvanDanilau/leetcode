package com.gmail.ivdanilov96.leetcode.tasks.medium;

import static java.util.Arrays.asList;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("Task #438 - Find All Anagrams in a String")
class FindAllAnagramsTest {

  @ParameterizedTest
  @MethodSource("initParameters")
  void findAnagrams(String source, String target, List<Integer> expected) {
    var task = new FindAllAnagrams();
    Assertions.assertEquals(expected, task.findAnagrams(source, target));
  }

  private static Stream<Arguments> initParameters() {
    return Stream.of(
        arguments("cbaebabacd", "abc", asList(0, 6)),
        arguments("abab", "ab", asList(0, 1, 2)));
  }
}