package leetcode;

public class GoalParserInterpretation1678 {
  public static void main(String[] args) {
    System.out.println("sfdfsdf");
    String interpret = new GoalParserInterpretation1678().interpret("G()(al)");
    System.out.println(interpret);
  }

  public String interpret(String command) {
    StringBuilder finalOutput = new StringBuilder();
    for (int i = 0; i < command.length(); i++) {
      if (command.charAt(i)=='G'){
        finalOutput.append("G");
      }
      if(command.charAt(i) == '('){
        if(command.charAt(i + 1) == ')'){
          finalOutput.append('o');
          i++;
        }else{
          finalOutput.append("al");
          i = i + 3;
        }
      }
    }
    return finalOutput.toString();
  }
}
