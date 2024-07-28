package leetcode;

import java.util.Arrays;

class Solution {
  public static void main(String[] args) {
    int[] numberArray = {2, 3, 2};
    int[] concatenation = new Solution().getConcatenation(numberArray);
    System.out.println(Arrays.toString(concatenation));
  }
  public int[] getConcatenation(int[] nums) {
    int numsLength = nums.length;
    int[] result = new int[nums.length * 2];
    for (int i = 0; i < numsLength; i++) {
      result[i] = nums[i];
      result[i + numsLength] = nums[i];
    }
    return result;
  }
}