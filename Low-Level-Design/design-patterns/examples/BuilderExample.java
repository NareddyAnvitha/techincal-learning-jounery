
class Student {

    private String name;
    private int age;
    private String course;

    private Student(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.course = builder.course;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }

    static class Builder {

        private String name;
        private int age;
        private String course;

        Builder setName(String name) {
            this.name = name;
            return this;
        }

        Builder setAge(int age) {
            this.age = age;
            return this;
        }

        Builder setCourse(String course) {
            this.course = course;
            return this;
        }

        Student build() {
            return new Student(this);
        }
    }
}

public class BuilderExample {
    public static void main(String[] args) {

        Student student = new Student.Builder()
                .setName("Anu")
                .setAge(23)
                .setCourse("MSc IT ")
                .build();

        student.display();
    }
}
