package leetcode;

public class PermutationDifferenceBetweenTwoStrings3146 {
  public static void main(String[] args) {
    int permutationDifference = new PermutationDifferenceBetweenTwoStrings3146().findPermutationDifference("abcde", "edbac");
    System.out.println(permutationDifference);
    System.out.println("second way :"+new PermutationDifferenceBetweenTwoStrings3146().findPermutationDifferenceSecondWay("abc", "bac"));
  }

  /**
   * This is one way to solve problem
   * @param s  String
   * @param t  String
   * @return int
   */
  public int findPermutationDifference(String s, String t) {
    int totalSum = 0;
    for (int i = 0; i < s.length(); i++) {
      for (int j = 0; j < t.length(); j++) {
        if (s.charAt(i) == t.charAt(j)) {
          int diff = i - j;
          totalSum = totalSum + Math.abs(diff);
        }
      }
    }
    return totalSum;
  }

  /**
   * This is one way to solve problem
   * @param s  String
   * @param t  String
   * @return int
   */
  public int findPermutationDifferenceSecondWay(String s, String t) {
    int sum = 0;
    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      sum += (Math.abs(i - t.indexOf(ch)));
    }
    return sum;
  }
}