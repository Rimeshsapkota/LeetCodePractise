package leetcode;

public class CalculateModulus {
  public static void main(String[] args) {
    System.out.println(Math.abs(4 - 9));
    int a = 5;
    int b = 9;
    int difference = a - b;
    int modulus = 0;
    if (difference < 0) {
      modulus = -difference;
    } else {
      modulus = difference;
    }
    System.out.println(modulus);
  }
}
