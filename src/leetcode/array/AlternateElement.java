package leetcode.array;

public class AlternateElement {
    public static void main(String[] args) {
        int[] val = {1, 2, 3, 4};
        int[] output = new AlternateElement().alternateElement(val);
        for (int out : output) {
            System.out.println(out);
        }
    }

    public int[] alternateElement(int[] val) {
        int length = val.length;
        int j = 0;
        int[] newVal;
        if (length % 2 == 0) {
            newVal = new int[val.length / 2];
        } else {
            newVal = new int[val.length / 2 + 1];
        }
        for (int i = 0; i < newVal.length; i++) {
            newVal[i] = val[j];
            j = j + 2;
        }
        return newVal;
    }

}
