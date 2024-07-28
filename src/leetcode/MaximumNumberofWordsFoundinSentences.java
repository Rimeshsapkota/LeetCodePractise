package leetcode;
//SOLVED
public class MaximumNumberofWordsFoundinSentences {
  public static void main(String[] args) {
    String[] sentence = {"w jrpihe zsyqn l dxchifbxlasaehj","nmmfrwyl jscqyxk a xfibiooix xolyqfdspkliyejsnksfewbjom","xnleojowaxwpyogyrayfgyuzhgtdzrsyococuqexggigtberizdzlyrdsfvryiynhg","krpwiazoulcixkkeyogizvicdkbrsiiuhizhkxdpssynfzuigvcbovm","rgmz rgztiup wqnvbucfqcyjivvoeedyxvjsmtqwpqpxmzdupfyfeewxegrlbjtsjkusyektigr","o lgsbechr lqcgfiat pkqdutzrq iveyv iqzgvyddyoqqmqerbmkxlbtmdtkinlk","hrvh efqvjilibdqxjlpmanmogiossjyxepotezo","qstd zui nbbohtuk","qsdrerdzjvhxjqchvuewevyzlkyydpeeblpc"};
    int number = new MaximumNumberofWordsFoundinSentences().mostWordsFound(sentence);
    System.out.println(number);
  }

  public int mostWordsFound(String[] sentences) {
    String spliting= " ";
    int[] valueStore = new int[sentences.length];
    for (int i = 0; i < sentences.length; i++) {
      String s = sentences[i];
      String[] split = s.split(spliting);
      valueStore[i] = split.length;
    }
    int number = valueStore[0];
    for (int k = 0; k < valueStore.length; k++) {
      if (valueStore[k] > number)
      {
        number = valueStore[k];
      }
    }
    return number;
  }
}
