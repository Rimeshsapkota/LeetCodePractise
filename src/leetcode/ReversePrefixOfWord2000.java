package leetcode;

public class ReversePrefixOfWord2000 {
  public static void main(String[] args) {
    System.out.println(new ReversePrefixOfWord2000().reversePrefix("abcdefd", 'd'));
  }

  public String reversePrefix(String word, char ch) {
    StringBuilder stringBuilder = new StringBuilder();
    StringBuilder stringBuilder1 = new StringBuilder();
    int flag = 0;
    for (int i = 0; i < word.length(); i++) {
      if (word.charAt(i) == ch) {
        if (flag == 0) {
          flag++;
          stringBuilder1.append(word.charAt(i));
          stringBuilder1.append(stringBuilder.reverse());
          stringBuilder1.append(word, stringBuilder1.length(), word.length());
        }
      }
      stringBuilder.append(word.charAt(i));
    }
    if (stringBuilder1.length() == 0) {
      return stringBuilder.toString();
    }
    return stringBuilder1.toString();
  }
}
