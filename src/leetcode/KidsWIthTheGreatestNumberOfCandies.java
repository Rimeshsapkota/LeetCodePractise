package leetcode;


import java.util.ArrayList;
import java.util.List;

public class KidsWIthTheGreatestNumberOfCandies {
  public static void main(String[] args) {
    int[] candies = {2, 3, 5, 1, 3};
    int extraCandies = 3;
    List<Boolean> list = new KidsWIthTheGreatestNumberOfCandies().kidsWithCandies(candies, extraCandies);
     for (Boolean b:list){
       System.out.println(b);
     }
  }

  public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    List<Boolean> booleanList = new ArrayList<>();
    int max = candies[0];
    for (int i = 1; i < candies.length; i++) {
      if (candies[i]>max){
        max = candies[i];
      }
    }
    for (int j : candies) {
      int sum=j+extraCandies;
      if (sum>=max) {
        booleanList.add(true);
      } else {
        booleanList.add(false);
      }
    }
    return booleanList;
  }
}
