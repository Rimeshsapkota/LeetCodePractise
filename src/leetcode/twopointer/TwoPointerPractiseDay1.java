package leetcode.twopointer;

/**
 * Any algorithm with time complexity O(n2) is not good because
 * it becomes very slow for large inputs,as the number of operation
 * grows quadratically with input size.
 */
public class TwoPointerPractiseDay1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 9;
        for (int m = 0; m <= arr.length - 1; m++) {
            for (int i = m+1; i <= arr.length - 1; i++) {
                int x = arr[m] + arr[i];
                if (target == x) {
                    System.out.println(arr[m] + " " + arr[i]);
                }
            }

        }
    }


}
