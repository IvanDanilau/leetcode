package com.gmail.ivdanilov96.leetcode.tasks.easy;

import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
@DisplayName("Task 104. Maximum Depth of Binary Tree")
class MaximumDepthOfBinaryTreeTest {

  @ParameterizedTest(name = """
      Сase {index}:
      Tree: #{index};
      expected max depth: {1})
      """)
  @MethodSource("initParameters")
  @DisplayName("Test cases:")
  void maxDepth(TreeNode tree, int expectedDepth) {
    var task = new MaximumDepthOfBinaryTree();
    Assertions.assertEquals(expectedDepth, task.maxDepth(tree));
  }

  private static Stream<Arguments> initParameters() {
    TreeNode firstTree = new TreeNode(3,
        new TreeNode(9),
        new TreeNode(20,
            new TreeNode(15),
            new TreeNode(7,
                new TreeNode(6), null)));

    TreeNode secondTree = new TreeNode(1, new TreeNode(2), null);
    TreeNode thirdTree = new TreeNode(1);
    return Stream.of(
        arguments(firstTree, 4),
        arguments(secondTree, 2),
        arguments(thirdTree, 1)
    );
  }
}

