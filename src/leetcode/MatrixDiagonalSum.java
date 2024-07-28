package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MatrixDiagonalSum {
  public static void main(String[] args) {
    int[][] diagonalSum = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    System.out.println(Arrays.toString(diagonalSum));
    int i = new MatrixDiagonalSum().diagonalSum(diagonalSum);
    System.out.println(i);
  }

  public int diagonalSum(int[][] mat) {
    int sum = 0;
    Set<Integer> integerSet = new HashSet<>();
    for (int i = 0; i < mat.length; i++) {
      int number = mat[i][i];
      integerSet.add(number);
    }
    return sum;
  }
}
