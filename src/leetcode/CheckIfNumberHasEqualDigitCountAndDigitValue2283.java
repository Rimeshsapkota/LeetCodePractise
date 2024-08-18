package leetcode;

public class CheckIfNumberHasEqualDigitCountAndDigitValue2283 {
  public static void main(String[] args) {
    int number = 3;
    char c = (char) number;
    System.out.println(new CheckIfNumberHasEqualDigitCountAndDigitValue2283().digitCount("030"));
  }

  public boolean digitCount(String num) {
    for (int i = 0; i < num.length(); i++) {
      char c = (char) ('0' + i);  // Correct conversion of index to digit character
      int count = 0;
      for (int j = 0; j < num.length(); j++) {
        if (num.charAt(j) == c) {
          count++;
        }
      }
      int expectedCount = num.charAt(i) - '0';
      if (count != expectedCount) {
        return false;
      }
    }
    return true;
  }
}