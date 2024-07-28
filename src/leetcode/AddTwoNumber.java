package leetcode;

import java.util.LinkedList;
import java.util.List;

public class AddTwoNumber {

  public static void main(String[] args) {
    List<Integer> firstNumber = new LinkedList<>();
    List<Integer> secondNumber = new LinkedList<>();

    firstNumber.add(2);
    firstNumber.add(3);
    firstNumber.add(4);

    secondNumber.add(2);
    secondNumber.add(3);
    secondNumber.add(4);

    StringBuilder stringBUildeForFirstNumber = new StringBuilder();

    for (Integer nuumbers : firstNumber) {
      stringBUildeForFirstNumber.append(nuumbers);
    }
    int i = Integer.parseInt(stringBUildeForFirstNumber.toString());


    StringBuilder stringBuilderForSecondNUmber = new StringBuilder();
    for (Integer numbers : secondNumber) {
      stringBuilderForSecondNUmber.append(numbers);
    }
    int i1 = Integer.parseInt(stringBuilderForSecondNUmber.toString());

    int sumOfNUmber =i+i1;
    System.out.println(sumOfNUmber);
    int reversedNumber = 0;
    while (sumOfNUmber>0){
      int rem = sumOfNUmber%10;
      reversedNumber=reversedNumber*10+rem;
      sumOfNUmber/=10;
    }
    System.out.println("reverse number is:"+reversedNumber);
  }
}
