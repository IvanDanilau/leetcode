package com.gmail.ivdanilov96.leetcode.tasks.easy;

import com.gmail.ivdanilov96.leetcode.tasks.Task;
import com.gmail.ivdanilov96.leetcode.tasks.TaskNum;

@Task(TaskNum.EASY_104)
public class MaximumDepthOfBinaryTree {

  public int maxDepth(TreeNode root) {
    return processTree(root, 0);
  }

  private int processTree(TreeNode node, int i) {
    if (node == null) {
      return i;
    } else {
      i++;
      return Math.max(processTree(node.left, i), processTree(node.right, i));
    }
  }
}
