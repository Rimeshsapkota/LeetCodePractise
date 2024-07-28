package leetcode;

public class NumberOfGoodPair {
  public static void main(String[] args) {
    int[] arr = {1, 2, 1,2,7,7,1,1};
    int i = new NumberOfGoodPair().numIdenticalPairs(arr);
    System.out.println(i);
  }

  public int numIdenticalPairs(int[] nums) {
    int count =0;
    for (int i = 0; i < nums.length; i++) {
      for (int j = i+1; j < nums.length; j++) {
        if (((nums[i] == nums[j]) && i < j)){
           count++;
        }
      }
    }
    return count;
  }
}
