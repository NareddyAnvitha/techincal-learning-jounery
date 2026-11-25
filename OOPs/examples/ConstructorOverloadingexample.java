
class Student {

    String name;
    int age;

    // Default constructor
    Student() {
        name = "Unknown";
        age = 0;
    }

    // Constructor with one parameter
    Student(String name) {
        this.name = name;
        age = 18;
    }

    // Constructor with two parameters
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println();
    }
}

public class ConstructorOverloadingExample {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student("Anu");
        Student s3 = new Student("Rahul", 22);

        s1.display();
        s2.display();
        s3.display();
    }
}
