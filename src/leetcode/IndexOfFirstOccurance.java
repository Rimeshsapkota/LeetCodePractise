package leetcode;

public class IndexOfFirstOccurance {
    public static void main(String[] args) {
        System.out.println(new IndexOfFirstOccurance().strStr("sadbutsad", "sad"));
    }

    public int strStr(String haystack, String needle) {
        int m = haystack.length(), n = needle.length();
        for (int i = 0; i < m - n; i++) {
            if (haystack.substring(i, i + n).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
