class Student {
    String name;
    static String college = "ABC College";

    Student(String name) {
        this.name = name;
    }

    static void changeCollege(String newCollege) {
        college = newCollege;
    }

    void display() {
        System.out.println(name + " - " + college);
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        Student s1 = new Student("Sampath");
        Student s2 = new Student("Ravi");

        s1.display();
        s2.display();

        Student.changeCollege("XYZ College");

        s1.display();
        s2.display();
    }
}
