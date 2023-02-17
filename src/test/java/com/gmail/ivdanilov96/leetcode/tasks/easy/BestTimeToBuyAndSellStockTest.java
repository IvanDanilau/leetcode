package com.gmail.ivdanilov96.leetcode.tasks.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("Task 121. Best Time to Buy and Sell Stock")
class BestTimeToBuyAndSellStockTest {

  @ParameterizedTest(name = """
      Сase {index}:
      Prices: {0};
      Expected profit: {1})
      """)
  @MethodSource("initParameters")
  @DisplayName("Test cases:")
  void maxProfit(int[] prices, int expectedProfit) {
    var task = new BestTimeToBuyAndSellStock();
    assertEquals(expectedProfit, task.maxProfit(prices));
    assertEquals(expectedProfit, task.maxProfitLeetcode(prices));
  }

  private static Stream<Arguments> initParameters() {
    return Stream.of(
        arguments(new int[]{7, 1, 5, 3, 6, 4}, 5),
        arguments(new int[]{7, 6, 4, 3, 1}, 0)
    );
  }
}