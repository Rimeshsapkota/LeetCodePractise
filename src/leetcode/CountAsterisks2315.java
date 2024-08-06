package leetcode;

public class CountAsterisks2315 {
  public static void main(String[] args) {
    System.out.println(new CountAsterisks2315().countAsterisks("l|*e*et|c**o|*de|"));
  }

  public int countAsterisks(String s) {
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == '|') {
        for (int j = i + 1; j < s.length(); j++) {
          if (s.charAt(j) == '|') {
            i=j;
            break;
          }
        }
      }
      stringBuilder.append(s.charAt(i));
    }
    int finalCount = 0;
    String finalString = stringBuilder.toString();
    for (int k = 0; k < finalString.length(); k++) {
      if (finalString.charAt(k) == '*') {
        finalCount++;
      }
    }
    return finalCount;
  }
}
