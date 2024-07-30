package leetcode;

/**
 * TODO:  not completd
 */
public class FaultyKeyboard2810 {
  public static void main(String[] args) {
    String word = "qskyviiiii";
    System.out.println(new FaultyKeyboard2810().finalString(word));
  }

  public String finalString(String s) {
    String finalOutput = "";
    String reverse = "";
    int count = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == 'i') {
        count++;
        if (count == 1) {
          for (int j = finalOutput.length() - 1; j >= 0; j--) {
            reverse = reverse + finalOutput.charAt(j);
          }
        } else {
          for (int j = reverse.length() - 1; j >= 0; j--) {
            reverse = reverse + reverse.charAt(j);
          }
        }
      }
      finalOutput = finalOutput + s.charAt(i);
    }
    return reverse;
  }
}
