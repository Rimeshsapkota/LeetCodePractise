package leetcode;

import java.util.Arrays;

public class ShuffleTheArray {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 8, 9};
    int n = 3;
    int[] num = new ShuffleTheArray().shuffle(arr, n);
    System.out.println(Arrays.toString(num));
  }

  public int[] shuffle(int[] nums, int n) {
    int numLength = nums.length;
    int[] shuffleArray = new int[nums.length];
    shuffleArray[0] = nums[0];
    shuffleArray[numLength - 1] = nums[numLength - 1];
    for (int i = 0; i < n; i++) {
      shuffleArray[2 * i] = nums[i];
      shuffleArray[2 * i + 1] = nums[n + i];
    }
    return shuffleArray;
  }
}
