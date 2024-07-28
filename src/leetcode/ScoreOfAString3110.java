package leetcode;

public class ScoreOfAString3110 {
  public static void main(String[] args) {
    System.out.println(new ScoreOfAString3110().scoreOfString("hello"));
  }
  public int scoreOfString(String s) {
    int sum=0;
    int diff=0;
     for (int i=0; i<s.length()-1; i++){
       char ch=s.charAt(i);
       char ch1=s.charAt(i+1);
       int asciiVal=(int)ch;
       int as2=(int)ch1;
       diff=Math.abs(asciiVal-as2);
       sum=sum+diff;
     }
     return sum;
  }
}
