package leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindWordsContainingCharacter {
  public static void main(String[] args) {
    String[] stringWord = {"leet", "code"};
    char x = 'e';
    List<Integer> list = new FindWordsContainingCharacter().findWordsContaining(stringWord, x);
    System.out.println(list);
  }

  public List<Integer> findWordsContaining(String[] words, char x) {
    List<Integer> integerList = new ArrayList<>();
    for (int i = 0; i < words.length; i++) {
      String word = words[i];
      for (int j = 0; j < word.length(); j++) {
        if (word.charAt(j) == x) {
          integerList.add(i);
          break;
        }
      }
    }
    return integerList;
  }

}