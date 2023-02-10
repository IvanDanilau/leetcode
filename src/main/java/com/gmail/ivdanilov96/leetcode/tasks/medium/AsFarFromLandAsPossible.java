package com.gmail.ivdanilov96.leetcode.tasks.medium;

import com.gmail.ivdanilov96.leetcode.tasks.Task;
import com.gmail.ivdanilov96.leetcode.tasks.TaskNum;
import java.util.ArrayDeque;
import java.util.Set;

@Task(TaskNum.MEDIUM_1162)
public class AsFarFromLandAsPossible {

  public int maxDistance(int[][] grid) {
    ArrayDeque<Node> queue = new ArrayDeque<>();
    //get land cells
    for (int i = 0; i < grid.length; i++) {
      for (int i1 = 0; i1 < grid[i].length; i1++) {
        if (grid[i][i1] == 1) {
          queue.offer(new Node(i, i1, 0));
        }
      }
    }
    //check map only land or only water
    if (queue.isEmpty() || queue.size() == grid.length * grid.length) {
      return -1;
    }
    int[][] dir = {{0, 1}, {1, 0}, {-1, 0}, {0, -1}};
    int[][] visited = new int[grid.length][grid.length];
    //init values range
    Set<Integer> ranges = Set.of(-1, grid.length);

    do {
      Node noda = queue.pop();
      visited[noda.hor][noda.ver] = 1;
      for (int[] direction : dir) {
        int hor = noda.hor + direction[0];
        int ver = noda.ver + direction[1];
        if (!ranges.contains(hor) && !ranges.contains(ver) && visited[hor][ver] == 0) {
          visited[hor][ver] = 1;
          queue.offer(new Node(hor, ver, noda.val + 1));
        }

      }
    } while (queue.size() > 1);
    return queue.pop().val;
  }

  private static class Node {

    public Node(int hor, int ver, int val) {
      this.hor = hor;
      this.ver = ver;
      this.val = val;
    }

    int hor;
    int ver;
    int val;
  }

}


