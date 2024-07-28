package leetcode;

public class RunnigSumOf1DArray {
  public static void main(String[] args) {
    int[] nums = {1, 2, 3, 4};
    int[] ints = new RunnigSumOf1DArray().runningSum(nums);
    for (int n : ints) {
      System.out.println(n);
    }
  }

  public int[] runningSum(int[] nums) {
    int[] finalResult = new int[nums.length];
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
      sum = sum + nums[i];
      finalResult[i] = sum;
    }
    return finalResult;
  }
}
