package leetcode.generic;

public class Animal<T> {
    public T content;

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public static void main(String[] args) {
        Animal<String> stringAnimal = new Animal<>();
        stringAnimal.setContent("rimeshh");
        System.out.println(stringAnimal.getContent());
        Animal<Integer> integerAnimal = new Animal<>();
        integerAnimal.setContent(10);
        System.out.println(integerAnimal.getContent());
    }
}


