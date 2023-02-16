package com.gmail.ivdanilov96.leetcode.tasks.easy;

import static com.gmail.ivdanilov96.leetcode.tasks.TaskNum.EASY_206;

import com.gmail.ivdanilov96.leetcode.tasks.Task;

@Task(EASY_206)
public class ReverseLinkedList {


  public ListNode reverseList(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }
    ListNode newNode = null;
    ListNode curr = head;
    while (curr != null) {
      newNode = new ListNode(curr.val, newNode);
      curr = curr.next;
    }
    return newNode;
  }


  public ListNode reverseListRecursion(ListNode head) {
    if (head == null) {
      return head;
    }
    return processReverse(null, head);
  }

  private ListNode processReverse(ListNode prev, ListNode head) {
    if (head.next == null) {
      return new ListNode(head.val, prev);
    }
    return processReverse(new ListNode(head.val, prev), head.next);
  }

}
