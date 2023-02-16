package com.gmail.ivdanilov96.leetcode.tasks.easy;

import com.gmail.ivdanilov96.leetcode.tasks.Task;
import com.gmail.ivdanilov96.leetcode.tasks.TaskNum;

@Task(TaskNum.EASY_876)
public class MiddleOfTheLinkedList {

  public ListNode middleNode(ListNode head) {
    if (head.next == null) {
      return head;
    }
    ListNode slow = head;
    ListNode fast = head.next;
    int slowCount = 1;
    int fastCount = 2;
    while (fast != null) {
      if (slowCount * 2 <= fastCount) {
        slowCount++;
        slow = slow.next;
      }
      fastCount++;
      fast = fast.next;
    }
    return slow;
  }

  public ListNode middleNodeLeetcode(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }

}
