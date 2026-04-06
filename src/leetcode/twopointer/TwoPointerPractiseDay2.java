package leetcode.twopointer;

public class TwoPointerPractiseDay2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 9;
        int left =0;
        int right =arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                System.out.print(left + " " + right);
                break;
            } else if (sum > target) {
                right--;
            } else {
                left++;
            }
        }
    }
}


