package leetcode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AInterviewPractiseQuestion {
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 3, 4, 89, 77, 33};
        Integer largestNumberFromArray = findLargestNumberFromArray(arr);
        System.out.println(largestNumberFromArray);
        System.out.println(reverseString("rimesh"));
        fibonacciSeries();
        System.out.println(reverseNumber(123456789));
        reverseNumberWithoutUsingThirdVariable();
        System.out.println("string contains vowel:"+stringContainsVowel("apple"));
        System.out.println(primeNumberCheck(15));
        System.out.println(onlyOddNumber(List.of(1,2,5,7)));
        System.out.println(removeWhiteSpace("rime    1 222"));
        iterateHashMapValue();
    }

    public static Integer findLargestNumberFromArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr[arr.length - 1];
    }

    public static String reverseString(String name) {
        String finalOutput = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            finalOutput = finalOutput + name.charAt(i);
        }
        return finalOutput;
    }

    public static void fibonacciSeries() {
        int count = 10;
        int firstNum = 0;
        int secondNum = 1;
        System.out.print(firstNum + " " + secondNum + " ");
        for (int i = 2; i < count; i++) {
            int temp = firstNum + secondNum;
            System.out.print(temp + " ");
            firstNum = secondNum;
            secondNum = temp;
        }
    }

    public static int reverseNumber(int number) {
        int reverseNumber = 0;
        while (number > 0) {
            int rem = number % 10;
            reverseNumber = reverseNumber * 10 + rem;
            number = number / 10;
        }
        return reverseNumber;
    }

    public static void reverseNumberWithoutUsingThirdVariable() {
        int a = 9;
        int b = 10;
        int sum = a + b;
        a = sum - a;
        b = sum - b;
        System.out.println(a + " " + b);
    }

    public static boolean stringContainsVowel(String name) {
        return name.toLowerCase().matches(".*[aeiou].*");
    }

    public static String primeNumberCheck(int number){
        if (number==0||number==1){
            return "it is not prime number";
        }
        if (number==2){
            return "2 is prime number";
        }
        for (int i=2; i<number/2; i++){
            if (number%i==0){
                return "it is not prime number";
            }
        }
        return "it is prime number";
    }

    public static boolean onlyOddNumber(List<Integer> number){
        for (Integer num :number){
            if (num%2==0){
                return false;
            }
        }
        return true;
    }

    public static boolean onlyOddNumberVersion2(List<Integer> number){
        return number.parallelStream().allMatch(x->x%2!=0);
    }

    public static String removeWhiteSpace(String name){
        String finalOutPut="";
        char[] chars=name.toCharArray();
        for (char char1 :chars){
            if (!Character.isWhitespace(char1)){
                finalOutPut=finalOutPut+char1;
            }
        }
        return finalOutPut;
    }
    public static long factorial(long n){
        if (n==1)return 1;
        else return (n*factorial(n-1));
    }

    public static void iterateHashMapValue(){
        Map<String,String> outputvalue=new HashMap<>();
        outputvalue.put("firstname","Rimesh");
        outputvalue.put("lastName","sapkota");
        for (Map.Entry val :outputvalue.entrySet()){
            Object value = val.getValue();

        }
    }
}
