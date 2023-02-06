package com.gmail.ivdanilov96.leetcode.tasks;

public @interface Task {

  TaskNum value();

  ProgrammingLang lang() default ProgrammingLang.JAVA;

}
