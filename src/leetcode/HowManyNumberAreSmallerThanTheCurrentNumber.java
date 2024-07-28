package leetcode;

//solved
public class HowManyNumberAreSmallerThanTheCurrentNumber {
  public static void main(String[] args) {
    int[] arr = new HowManyNumberAreSmallerThanTheCurrentNumber().smallerNumbersThanCurrent(new int[]{8, 1, 2, 2, 3});
    for (int arr1 : arr) {
      System.out.println(arr1);
    }
  }

  public int[] smallerNumbersThanCurrent(int[] nums) {
    int[] result = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      int count = 0;
      for (int j = 0; j < nums.length; j++) {
        if (nums[i] > nums[j]) {
          count++;
        }
      }
      result[i] = count;
    }
    return result;
  }
}
