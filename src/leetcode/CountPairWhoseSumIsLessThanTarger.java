package leetcode;

import java.util.ArrayList;
import java.util.List;

public class CountPairWhoseSumIsLessThanTarger {
  public static void main(String[] args) {
    List<Integer> integerList = new ArrayList<>();
    integerList.add(-6);
    integerList.add(2);
    integerList.add(5);
    integerList.add(-2);
    integerList.add(-7);
    integerList.add(-1);
    integerList.add(3);
    int target=-2;
    int i = new CountPairWhoseSumIsLessThanTarger().countPairs(integerList, target);
    System.out.println(i);
  }
  public int countPairs(List<Integer> nums, int target) {
    int totalPairs=0;
    for (int i=0; i<nums.size(); i++){
      for (int j=i+1; j<nums.size(); j++){
        if (nums.get(i) + nums.get(j) < target){
          totalPairs++;
        }
      }
    }
    return totalPairs;
  }
}
