package leetcode;

public class DefangingAnIPAddress1108 {
  public static void main(String[] args) {
    String finalOutput =new DefangingAnIPAddress1108().defangIPaddr("255.100.50.0");
    System.out.println(finalOutput);
  }
  public String defangIPaddr(String address) {
    String[] split =address.split("\\.");
    String finalOutput="";
    StringBuilder stringBuilder = new StringBuilder();
    for (int i=0; i<address.length(); i++){
      if (address.charAt(i)=='.'){
        stringBuilder.append("[.]");
        continue;
      }
      stringBuilder.append(address.charAt(i));
    }
    return stringBuilder.toString() ;
  }
}


//public String defangIPaddr(String address) {
//  String finalOutput="";
//  for (int i=0; i<address.length(); i++){
//    if (address.charAt(i)=='.'){
//      finalOutput+="[.]";
//      continue;
//    }
//    finalOutput=finalOutput+address.charAt(i);
//  }
//  return finalOutput ;
//}