package leetcode;

import java.util.ArrayList;
import java.util.List;

public class CountItemsMatchingARule_1773 {

  public static void main(String[] args) {
//    items = [["phone", "blue", "pixel"],["computer", "silver", "lenovo"],["phone", "gold", "iphone"]],
//    ruleKey = "color", ruleValue = "silver
    List<String> item1 = new ArrayList<>();
    item1.add("phone");
    item1.add("blue");
    item1.add("pixel");

    List<String> item2 = new ArrayList<>();
    item2.add("computer");
    item2.add("silver");
    item2.add("lenovo");

    List<String> item3 = new ArrayList<>();
    item3.add("phone");
    item3.add("gold");
    item3.add("iphone");

    List<List<String>> listOfItems = new ArrayList<>();
    listOfItems.add(item1);
    listOfItems.add(item2);
    listOfItems.add(item3);

    String ruleKey = "color";
    String ruleValue = "silver";

    int countMatches = new CountItemsMatchingARule_1773().countMatches(listOfItems, ruleKey, ruleValue);
    System.out.println(countMatches);

  }

  public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
    int result = 0;
    for (List<String> item : items) {
      if (ruleKey.equals("type") && item.get(0).equals(ruleValue)) {
        result++;
      }
      if (ruleKey.equals("color") && item.get(1).equals(ruleValue)) {
        result++;
      }
      if (ruleKey.equals("name") && item.get(2).equals(ruleValue)) {
        result++;
      }
    }
    return result;
  }
}