package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class RichestCustomerHealth {
  public static void main(String[] args) {
    int[][] wealthPerson = {{1, 2, 3}, {2, 3, 4}};
    System.out.println(new RichestCustomerHealth().maximumWealth(wealthPerson));
  }

  public int maximumWealth(int[][] accounts) {
    int sum = 0;
    List<Integer> integerList = new ArrayList<>();

    for (int[] account : accounts) {
      for (int k : account) {
        sum += k;
      }
      integerList.add(sum);
      sum = 0;
    }
    Optional<Integer> optionalInteger = integerList.stream().max(Integer::compareTo);
    return optionalInteger.isPresent()?optionalInteger.get():0;
//    return optionalInteger.orElse(0);
  }
}