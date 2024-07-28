package leetcode;

public class ShuffleString_1528 {
  public static void main(String[] args) {
    String s = "codeleet";
    int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};
    String finalOutput = new ShuffleString_1528().restoreString(s, indices);
    System.out.println(finalOutput);
  }

  public String restoreString(String s, int[] indices) {
    String finalResult="";
    for (int i = 0; i < indices.length; i++) {
      int x = indices[i];
      char charredAt = s.charAt(x);
      finalResult=finalResult+charredAt;
    }
    return finalResult;
  }
}
