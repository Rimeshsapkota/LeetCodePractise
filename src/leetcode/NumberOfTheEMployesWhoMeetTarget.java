package leetcode;

public class NumberOfTheEMployesWhoMeetTarget {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3};
    int target = 2;
    System.out.println(new NumberOfTheEMployesWhoMeetTarget().numberOfEmployeesWhoMetTarget(arr, target));
  }

  public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
    int count = 0;
    for (int hour : hours) {
      if (hour >= target) {
        count++;
      }
    }
    return count;
  }
}
