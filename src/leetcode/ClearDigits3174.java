package leetcode;

public class ClearDigits3174 {
  public static void main(String[] args) {
    String name = "cdef12";
    System.out.println(new ClearDigits3174().clearDigits(name));
  }

  public String clearDigits(String s) {
    StringBuilder stringBuilder = new StringBuilder();
    for (char ch : s.toCharArray()) {
      if (!Character.isAlphabetic(ch)) {
         stringBuilder.deleteCharAt(stringBuilder.length()-1);
      }
      else{
        stringBuilder.append(ch);
      }
    }
    return stringBuilder.toString();
  }
}