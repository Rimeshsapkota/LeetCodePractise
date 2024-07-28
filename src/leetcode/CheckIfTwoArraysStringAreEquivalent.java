package leetcode;

public class CheckIfTwoArraysStringAreEquivalent {
  public static void main(String[] args) {
    String[] word1 = {"ab", "c"};
    String[] word2 = {"a", "bc"};
    boolean b = new CheckIfTwoArraysStringAreEquivalent().arrayStringsAreEqual(word1, word2);
    System.out.println(b);

  }

  public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
    StringBuilder stringBuilder = new StringBuilder();
    StringBuilder stringBuilder1 = new StringBuilder();
    for (String word : word1) {
      stringBuilder1.append(word);
    }
    for (String word : word2) {
      stringBuilder.append(word);
    }
    return stringBuilder.toString().contentEquals(stringBuilder1);
  }
}
