package com.gmail.ivdanilov96.leetcode.tasks.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("Task 824. Goat Latin")
class GoatLatinTest {

  @ParameterizedTest(name = """
      Сase {index}:
      Input string: {0};
      Expected converted: {1})
      """)
  @MethodSource("initParameters")
  @DisplayName("Test cases:")
  void toGoatLatin(String input, String expectedConverted) {
    var task = new GoatLatin();
    assertEquals(expectedConverted, task.toGoatLatin(input));
  }

  private static Stream<Arguments> initParameters() {
    return Stream.of(
        arguments("I speak Goat Latin", "Imaa peaksmaaa oatGmaaaa atinLmaaaaa"),
        arguments("The quick brown fox jumped over the lazy dog",
            "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa"));
  }
}