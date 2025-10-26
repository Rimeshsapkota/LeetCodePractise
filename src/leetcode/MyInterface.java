package leetcode;

public interface MyInterface {
    default  void defaultVoidMethod(){
        int privateMethod=privateMethod();
        int staticPrivateMethod=privateStaticMethod();
    }
    static void staticMethod(){
        int method=privateStaticMethod();
    }
    private int privateMethod(){
        return 1;
    }

    private static int privateStaticMethod(){
        return 1;
    }
}
