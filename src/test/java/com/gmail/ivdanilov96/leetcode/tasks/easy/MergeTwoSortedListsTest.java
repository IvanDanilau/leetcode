package com.gmail.ivdanilov96.leetcode.tasks.easy;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Task 21. Merge Two Sorted Lists")
class MergeTwoSortedListsTest {


  @Test
  void mergeTwoLists() {
    ListNode first = new ListNode(1, new ListNode(3, new ListNode(4)));
    ListNode second = new ListNode(1, new ListNode(2, new ListNode(4)));
    var task = new MergeTwoSortedLists();
    ListNode curr = task.mergeTwoLists(first, second);
    List<Integer> values = new ArrayList<>();
    while (curr != null) {
      values.add(curr.val);
      curr = curr.next;
    }
    Assertions.assertEquals(List.of(1, 1, 2, 3, 4, 4), values);
  }
}