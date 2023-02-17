package com.gmail.ivdanilov96.leetcode.tasks.easy;

import static com.gmail.ivdanilov96.leetcode.tasks.TaskNum.EASY_783;

import com.gmail.ivdanilov96.leetcode.tasks.Task;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;

@Task(EASY_783)
public class MinimumDistanceBetweenBSTNodes {

  public int minDiffInBST(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    Queue<TreeNode> queue = new ArrayDeque<>();
    queue.offer(root);
    while (!queue.isEmpty()) {
      TreeNode node = queue.poll();
      if (node.left != null) {
        queue.offer(node.left);
      }
      if (node.right != null) {
        queue.offer(node.right);
      }
      result.add(node.val);
    }
    Collections.sort(result);
    int minDistance = Integer.MAX_VALUE;
    for (int i = 1; i < result.size(); i++) {
      Integer prev = result.get(i - 1);
      Integer curr = result.get(i);
      minDistance = Math.min(minDistance, curr - prev);
    }
    return minDistance;
  }

  public int minDiffInBSTLeetcode(TreeNode root) {
    List<TreeNode> nodes = new ArrayList<>();
    processTree(nodes, root);
    int minDistance = Integer.MAX_VALUE;
    for (int i = 1; i < nodes.size(); i++) {
      Integer prev = nodes.get(i - 1).val;
      Integer curr = nodes.get(i).val;
      minDistance = Math.min(minDistance, curr - prev);
    }
    return minDistance;
  }

  private void processTree(List<TreeNode> nodes, TreeNode node) {
    if (node == null) {
      return;
    }
    processTree(nodes, node.left);
    nodes.add(node);
    processTree(nodes, node.right);
  }

}