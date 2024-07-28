package leetcode;

import java.util.Arrays;

public class SortThePeople2418 {
  public static void main(String[] args) {
    System.out.println("jhkjhkj" + Arrays.toString(new SortThePeople2418().sortPeople(new String[]{"Rimesh", "Saphal"}, new int[]{2, 10})));
  }

  public String[] sortPeople(String[] names, int[] heights) {
    int[] ints = Arrays.copyOf(heights, heights.length);
    int[] sortedHeights = new int[heights.length];
    String[] sortedName = new String[names.length];
    for (int i = 0; i < heights.length; i++) {
      for (int j = i; j < heights.length; j++) {
        if (heights[i] < heights[j]) {
          int swap = heights[i];
          heights[i] = heights[j];
          heights[j] = swap;
        }
      }
    }
    for (int j = 0; j < heights.length; j++) {
      sortedHeights[j] = heights[j];
    }
    for (int i = 0; i < sortedHeights.length; i++) {
      for (int j = 0; j < sortedHeights.length; j++) {
        if (sortedHeights[i] == ints[j]) {
          sortedName[i] = names[j];
        }
      }
    }
    return sortedName;
  }

}
