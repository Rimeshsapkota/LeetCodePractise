package leetcode;

public class NumberOfSeniorCitizens2678 {
  public static void main(String[] args) {
    String[] details = new String[]{"7868190130M7522", "5303914400F9211", "9273338290F4010"};
    System.out.println(new NumberOfSeniorCitizens2678().countSeniors(details));
  }

  public int countSeniors(String[] details) {
    int count = 0;
    for (String word : details) {
      int age= Integer.parseInt(word.substring(11,13));
      if (age > 60) {
        count++;
      }
    }
    return count;
  }

  public int countSeniorsNextWay(String[] details) {
    int count = 0;
    StringBuilder stringBuilder = new StringBuilder();
    for (String word : details) {
      StringBuilder append = stringBuilder.append(word.charAt(11)).append(word.charAt(12));
      String appendString = append.toString();
      int parseInt = Integer.parseInt(appendString);
      if (parseInt > 60) {
        count++;
      }
      append.delete(0,2);
    }
    return count;
  }
}
