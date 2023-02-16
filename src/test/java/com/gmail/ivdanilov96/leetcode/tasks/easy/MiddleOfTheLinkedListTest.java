package com.gmail.ivdanilov96.leetcode.tasks.easy;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Task 876. Middle of the Linked List")
class MiddleOfTheLinkedListTest {

  @Test
  void middleNode() {
    var task = new MiddleOfTheLinkedList();
    ListNode tail = new ListNode(5);
    ListNode list = new ListNode(1,
        new ListNode(2,
            new ListNode(3,
                new ListNode(4,
                    tail))));
    List<Integer> expected = List.of(3, 4, 5);
    Assertions.assertEquals(expected, mapToArrayList(task.middleNode(list)));
    tail.next = new ListNode(6);
    expected = List.of(4, 5, 6);
    Assertions.assertEquals(expected, mapToArrayList(task.middleNodeLeetcode(list)));
  }

  private List<Integer> mapToArrayList(ListNode iterationRes) {
    ListNode curr = iterationRes;
    List<Integer> values = new ArrayList<>();
    while (curr != null) {
      values.add(curr.val);
      curr = curr.next;
    }
    return values;
  }
}