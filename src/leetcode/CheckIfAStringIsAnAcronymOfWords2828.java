package leetcode;

import java.util.List;

public class CheckIfAStringIsAnAcronymOfWords2828 {
  public static void main(String[] args) {
    List<String> words = List.of("an", "apple");
    String s = "a";
    System.out.println(new CheckIfAStringIsAnAcronymOfWords2828().isAcronym(words, s));
  }

  public boolean isAcronym(List<String> words, String s) {
    StringBuilder storeAcronym = new StringBuilder();
    for (String word : words) {
      for (int i = 0; i < 1; i++) {
        char charredAt = word.charAt(i);
        storeAcronym.append(charredAt);
      }
    }
    return s.contentEquals(storeAcronym);
  }
}
