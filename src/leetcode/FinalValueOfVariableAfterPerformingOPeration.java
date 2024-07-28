package leetcode;

public class FinalValueOfVariableAfterPerformingOPeration {
  public static void main(String[] args) {
    String[] operations = {"--X","X++","X++"};
    int output = new FinalValueOfVariableAfterPerformingOPeration().finalValueAfterOperations(operations);
    System.out.println(output);
  }

  public int finalValueAfterOperations(String[] operations) {
    int initialValue = 0;
    for (String finalout : operations) {
      if (finalout.equals("X++")) {
        initialValue++;
      }
      if (finalout.equals("++X")) {
        ++initialValue;
      }
      if (finalout.equals("X--")) {
        initialValue--;
      }
      if (finalout.equals("--X")) {
        --initialValue;
      }
    }
    return initialValue;
  }
}
