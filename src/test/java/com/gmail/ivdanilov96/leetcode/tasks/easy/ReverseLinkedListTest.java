package com.gmail.ivdanilov96.leetcode.tasks.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Task 206. Reverse Linked List")
class ReverseLinkedListTest {

  @Test
  void reverseList() {
    ListNode first = new ListNode(1, new ListNode(3, new ListNode(4)));
    var task = new ReverseLinkedList();
    ListNode iterationRes = task.reverseList(first);
    ListNode recursionRes = task.reverseListRecursion(first);
    List<Integer> expected = List.of(4, 3, 1);
    assertEquals(expected, mapToArrayList(iterationRes));
    assertEquals(expected, mapToArrayList(recursionRes));
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