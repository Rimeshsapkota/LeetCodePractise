package leetcode;

import java.util.Arrays;

public class ReverseString344 {
  public static void main(String[] args) {
    char[] chars = new char[]{'h', 'e', 'l', 'l', 'o'};
    new ReverseString344().reverseString(chars);
  }

  public void reverseString(char[] s) {
      int left=0;
      int right=s.length-1;
      while (right>left){
        char temp=s[left];
        s[left]=s[right];
        s[right]=temp;
        left++;
        right--;
      }
  }
}
