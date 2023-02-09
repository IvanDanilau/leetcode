package com.gmail.ivdanilov96.leetcode.tasks.hard;

import static com.gmail.ivdanilov96.leetcode.tasks.TaskNum.HARD_2306;

import com.gmail.ivdanilov96.leetcode.tasks.Task;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Task(HARD_2306)
public class NamingACompany {

  public long distinctNames(String[] ideas) {
    long counter = 0;
    Map<Integer, Set<String>> dict = new HashMap<>(26);

    for (int curr = 0; curr < 26; curr++) {
      dict.put(curr, new HashSet<>());
    }
    for (String idea : ideas) {
      int i = idea.charAt(0) - 'a';
      Set<String> set = dict.get(i);
      set.add(idea.substring(1));
      dict.put(i, set);
    }

    for (int curr = 0; curr < 26; curr++) {
      for (int next = curr + 1; next < 26; next++) {
        Set<String> one = dict.get(curr);
        Set<String> two = dict.get(next);
        int equal = 0;
        for (String str : one) {
          if (two.contains(str)) {
            equal++;
          }
        }
        counter += 2L * (one.size() - equal) * (two.size() - equal);
      }
    }
    return counter;
  }

  //also works but not effective
  public long brutForce(String[] ideas) {
    long counter = 0;
    Set<String> originals = new HashSet<>(Arrays.asList(ideas));
    Set<String> newIdeas = new HashSet<>();
    for (int curr = 0; curr < ideas.length; curr++) {
      for (int next = curr + 1; next < ideas.length; next++) {
        if (ideas[curr].charAt(0) != ideas[next].charAt(0)) {
          String newIdeaOne = ideas[curr].charAt(0) + ideas[next].substring(1);
          String newIdeaTwo = ideas[next].charAt(0) + ideas[curr].substring(1);
          if (!originals.contains(newIdeaTwo) && !originals.contains(newIdeaOne)) {
            if (!newIdeas.contains(newIdeaOne + "_" + newIdeaTwo)) {
              newIdeas.add(newIdeaOne + "_" + newIdeaTwo);
              counter++;
            }
            if (!newIdeas.contains(newIdeaTwo + "_" + newIdeaOne)) {
              newIdeas.add(newIdeaTwo + "_" + newIdeaOne);
              counter++;
            }
          }
        }
      }
    }
    return counter;
  }
}

