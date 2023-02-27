package com.gmail.ivdanilov96.leetcode.tasks.medium;

import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("Task 692. Top K Frequent Words")
class TopKFrequentWordsTest {

  @ParameterizedTest(name = """
      Сase {index}:
      Input words: {0};
      top k expected: {1};
      Expected words: {2})
      """)
  @MethodSource("initParameters")
  @DisplayName("Test cases:")
  void topKFrequent(String[] input, int topK, List<String> expected) {
    var task = new TopKFrequentWords();
    Assertions.assertArrayEquals(expected.toArray(), task.topKFrequent(input, topK).toArray());
  }

  private static Stream<Arguments> initParameters() {
    return Stream.of(
        arguments(new String[]{"i", "love", "leetcode", "i", "love", "coding"},
            2,
            List.of("i", "love")),
        arguments(
            new String[]{"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"},
            4,
            List.of("the", "is", "sunny", "day")
        )
    );
  }
}