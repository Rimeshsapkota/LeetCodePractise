package leetcode;

class Person {
    // Instance variables (object variables)
    String name;
    int age;

    // Constructor to initialize the variables
    Person(String n, int a) {
        name = n;   // initializing variable 'name'
        age = a;    // initializing variable 'age'
    }

    void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Creating objects - constructor automatically initializes the variables
        Person p1 = new Person("Rimesh", 28);
        Person p2 = new Person("Kisu Kisu", 45);

        // Displaying initialized values
        p1.showDetails();
        p2.showDetails();
    }
}

