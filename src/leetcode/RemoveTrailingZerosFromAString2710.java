package leetcode;

public class RemoveTrailingZerosFromAString2710 {

  public static void main(String[] args) {
    System.out.println(new RemoveTrailingZerosFromAString2710().removeTrailingZeros("51230100"));
  }

  //  public String removeTrailingZeros(String num) {
//    if (num.charAt(num.length()-1)!='0'){
//      return num;
//    }
//    int val = Integer.parseInt(num);
//    int nums=0;
//    while (val > 1) {
//      if (val % 10 == 0) {
//        val = val / 10;
//        nums=val;
//      }
//      else {
//        break;
//      }
//    }
//    return String.valueOf(nums);
//  }
  public String removeTrailingZeros(String num) {
    String newsTRING = "";
    if (num.charAt(num.length() - 1) == '0') {
      for (int i = num.length() - 1; i >=0; i--) {
        if (num.charAt(i) == '0') {
          newsTRING = num.substring(0, i);
          if (!(newsTRING.charAt(newsTRING.length()-1) =='0')){
           break;
          }
        }
        else {
          break;
        }
      }
      return newsTRING;
    } else {
      return num;
    }
  }

}
