package leetcode;

public class SumTwoNumberInArray {
  public static void main(String[] args) {
    int[] firstNumber = {1, 2, 3, 4, 5};
    int[] secondNumber = {4, 5, 1, 2};
    Integer number = returnNumber(firstNumber, secondNumber);
    System.out.println(number);
  }

  public static Integer returnNumber(int[] num1, int[] num2) {
    StringBuilder stringBuilder = new StringBuilder();
    StringBuilder stringBuilder1 = new StringBuilder();
    for (int num : num1) {
      stringBuilder.append(num);
    }
    for (int num : num2) {
      stringBuilder1.append(num);
    }
    return Integer.parseInt(stringBuilder.toString()) + Integer.parseInt(stringBuilder1.toString());
  }
}