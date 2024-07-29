package leetcode;

/**
 * Done!!!
 */
public class ReverseWordsInAStringIII557 {
  public static void main(String[] args) {
    String s = "Let's take LeetCode contest";
    System.out.println(new ReverseWordsInAStringIII557().reverseWords(s));
  }

  public String reverseWords(String s) {
    StringBuilder stringBuilder = new StringBuilder();
    String[] splitWord = s.split(" ");
    String[] reverseWord = new String[splitWord.length];
    for (int i = 0; i < splitWord.length; i++) {
      String word = splitWord[i];
        for (int j = word.length() - 1; j >= 0; j--) {
          stringBuilder.append(word.charAt(j));
        }
        if (i < splitWord.length - 1) {
          stringBuilder.append(" ");
        }


    }
    return stringBuilder.toString();
  }
}
