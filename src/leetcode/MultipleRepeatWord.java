package leetcode;
public class MultipleRepeatWord {
    public static void main(String[] args) {
        int[] arr = {1,4,3,6,8};
        int[] finalArr= new int[arr.length];
        for(int a=0; a<arr.length; a++){
            int num=arr[a];
            if (num%2==0){
                int squarenumber=num*num;
                finalArr[a]=squarenumber;
            }
            else{
                finalArr[a]=num;
            }
        }
        for (int b : finalArr){
            System.out.println(b);
        }
    }
}
