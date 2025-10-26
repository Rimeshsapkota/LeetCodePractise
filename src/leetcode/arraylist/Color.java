package leetcode.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Color {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Red");
        arrayList.add("white");
        arrayList.add("yellow");
        System.out.println(arrayList);
        arrayList.set(1,"pink");
        System.out.println(arrayList);
        System.out.println("---------------");
        new Color().someChallange();
    }
    public void someChallange(){
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");
        System.out.println(list_Strings);
        list_Strings.set(2, "Yellow");
        System.out.println(list_Strings);
    }
}
