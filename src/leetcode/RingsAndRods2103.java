package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class RingsAndRods2103 {
  public static void main(String[] args) {
    String ring = "B0B6G0R6R0R6G9";
    System.out.println(new RingsAndRods2103().countPoints(ring));
  }

  public int countPoints(String rings) {
    Map<Character, Set<Character>> ringMap = new HashMap<>();

    for (int i = 0; i < rings.length(); i = i + 2) {
      char color = rings.charAt(i);
      char rod = rings.charAt(i + 1);

      if (!ringMap.containsKey(rod)) {
        ringMap.put(rod, new HashSet<>());
      }
      ringMap.get(rod).add(color);
    }
    int count = 0;
    for (Set<Character> set : ringMap.values()) {
      if (set.contains('B') && set.contains('R') && set.contains('G')) {
        count++;
      }
    }
    return count;
  }
}