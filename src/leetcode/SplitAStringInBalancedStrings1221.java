package leetcode;

public class SplitAStringInBalancedStrings1221 {
  public static void main(String[] args) {
    System.out.println(new SplitAStringInBalancedStrings1221().balancedStringSplit("LLLLRRRR"));
  }

  public int balancedStringSplit(String s) {
    int countForL = 0;
    int countForR = 0;
    int totalResult = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == 'R') {
        countForR++;
      }
      if (s.charAt(i) == 'L') {
        countForL++;
      }
      if (countForR == countForL) {
        totalResult++;
        countForR = 0;
        countForL = 0;
      }
    }
    return totalResult;
  }
}


