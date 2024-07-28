package leetcode;

public class TruncateSentence1816 {
  public static void main(String[] args) {
    System.out.println(new TruncateSentence1816().truncateSentence("Hello i am rimes", 2));
  }

  public String truncateSentence(String s, int k) {
    String[] s1 = s.split(" ");
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < s1.length; i++) {
      if (i < k) {
        stringBuilder.append(s1[i]);
      }
      if (i<k-1){
        stringBuilder.append(" ");
      }
    }
    return stringBuilder.toString();
  }
}
