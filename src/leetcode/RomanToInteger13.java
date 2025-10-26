package leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger13 {
    public static void main(String[] args) {
        int l = new RomanToInteger13().romanToInt("IV");
        System.out.println(l);
    }

    public int romanToInt(String s) {
        int sum = 0;
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        int val1=0;
        int val2=0;
        for (int i = 0; i < s.length(); i++) {
            for (Map.Entry<Character, Integer> entry : romanMap.entrySet()) {
                Character key = entry.getKey();
                if (s.charAt(i) == key) {
                   int temp= entry.getValue();
                    val2=temp;
                    if (i==0){
                        sum = sum + entry.getValue();
                    }
                    else {
                        val1= temp;
                        if (temp>val2){
                            sum= entry.getValue()-sum;
                        }
                    }
                }

            }
        }
        return sum;
    }

}
