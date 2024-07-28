package leetcode;

public class Subset {
  public static void main(String[] args) {
    int[] number = {1, 2};
    int lengthOfNumber = number.length;
    int[][] practise = {{1, 2}, {3, 4}};
    System.out.println("pracits" + practise[0][1]);
    int totalNumberOfSubSet = 1 << lengthOfNumber;
    int[][] result = new int[totalNumberOfSubSet][4];
    System.out.println(result[0][0] = 0);
    for (int i = 0; i < number.length; i++) {
      result[i][0]=number[i];
    }

  }
}
