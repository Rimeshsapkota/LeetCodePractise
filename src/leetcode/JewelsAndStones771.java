package leetcode;

public class JewelsAndStones771 {
  public static void main(String[] args) {
    System.out.println(new JewelsAndStones771().numJewelsInStones("aA","aAAbbbb"));
  }
  public int numJewelsInStones(String jewels, String stones) {
     int count=0;
     for (int i=0; i<jewels.length(); i++){
       for (int j=0; j<stones.length(); j++ ){
         if (jewels.charAt(i)==stones.charAt(j)){
           count++;
         }
       }
     }
     return count;
  }
}
