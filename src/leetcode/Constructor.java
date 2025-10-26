package leetcode;

public class Constructor {

    public static void main(String[] args) {
        //a ma 9 store vako xaina
       Constructor constructor = new Constructor();
       int a=constructor.sum(7,8);
        System.out.println(a);

        int divide =constructor.divide(10,2);
        System.out.println(divide);
    }

    public int sum(int a , int b){
        return a+b;
    }

    public int divide(int a , int b){
        return a/b;
    }
   public String print(){
        return "rimeesh";
   }

}
