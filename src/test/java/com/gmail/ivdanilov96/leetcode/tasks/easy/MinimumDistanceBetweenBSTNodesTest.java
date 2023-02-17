package com.gmail.ivdanilov96.leetcode.tasks.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Task 783. Minimum Distance Between BST Nodes")
class MinimumDistanceBetweenBSTNodesTest {

  @Test
  void minDiffInBST() {
    TreeNode tree = new TreeNode(1,
        new TreeNode(0), new TreeNode(48,
        new TreeNode(12), new TreeNode(49)));
    var task = new MinimumDistanceBetweenBSTNodes();
    assertEquals(1, task.minDiffInBST(tree));
    assertEquals(1, task.minDiffInBSTLeetcode(tree));
  }
}