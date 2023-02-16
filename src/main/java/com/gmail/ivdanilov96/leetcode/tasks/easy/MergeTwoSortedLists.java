package com.gmail.ivdanilov96.leetcode.tasks.easy;

import static com.gmail.ivdanilov96.leetcode.tasks.TaskNum.EASY_21;

import com.gmail.ivdanilov96.leetcode.tasks.Task;

@Task(EASY_21)
public class MergeTwoSortedLists {


  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    if (list1 == null) {
      return list2;
    }
    if (list2 == null) {
      return list1;
    }
    if (list1.val < list2.val) {
      return new ListNode(list1.val, mergeTwoLists(list1.next, list2));
    } else {
      return new ListNode(list2.val, mergeTwoLists(list2.next, list1));
    }
  }

}
