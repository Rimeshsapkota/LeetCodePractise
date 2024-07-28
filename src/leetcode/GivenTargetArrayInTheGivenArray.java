package leetcode;
//this program is not solved.
public class GivenTargetArrayInTheGivenArray {
  public static void main(String[] args) {
    int[] nums = {0, 1, 2, 3, 4};
    int[] index = {0, 1, 2, 2, 1};
    int[] finalResult = new GivenTargetArrayInTheGivenArray().createTargetArray(nums, index);
    for (int result : finalResult) {
      System.out.println(result);
    }
  }

  public int[] createTargetArray(int[] nums, int[] index) {
    int[] finalResult = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      finalResult[index[i]] = nums[i];

    }
    return finalResult;
  }
}
