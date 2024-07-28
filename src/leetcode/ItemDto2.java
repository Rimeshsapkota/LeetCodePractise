package leetcode;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ItemDto2 {
  private String item;
  private  Double price;

  public ItemDto2(String item, Double itemCode, Double price) {
    this.item = item;
    this.price = price;
  }

  public Double getPrice() {
    return price;
  }
  private String getName() {
    return item;
  }
  public static void main(String[] args) {
    List<ItemDto2> car = new ArrayList<>();
    List<ItemDto2> electronics = new ArrayList<>();

    Map<String, List<ItemDto2>> integerMap = new HashMap<>();
    car.add(new ItemDto2("TATA", 60.0, 6000.0));
    car.add(new ItemDto2("BYD", 70.0, 5000.0));

    electronics.add(new ItemDto2("IPHOME", 60.0, 6000.0));
    electronics.add(new ItemDto2(" APPLE WATCH", 70.0, 5000.0));

    integerMap.put("car", car);
    integerMap.put("electronics", electronics);

    Map<String, ItemDto2> maxPriceItems = new HashMap<>();

    integerMap.forEach((category, items) -> {
      ItemDto2 maxPriceItem = items.stream()
              .max(Comparator.comparingDouble(ItemDto2::getPrice))
              .orElse(null);
      maxPriceItems.put(category, maxPriceItem);
    });
    maxPriceItems.forEach((category, item) -> {
      if (item != null) {
        System.out.println("Highest priced item in " + category + ": " + item.getName() + " with price " + item.getPrice());
      } else {
        System.out.println("No items found in category: " + category);
      }
    });
  }


}
