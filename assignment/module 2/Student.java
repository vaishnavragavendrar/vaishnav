import java.util.Scanner;
class Student {
    int usn;
    String name;
    double marks;+
    Student() {
        usn = 0;
        name = "Not Assigned";
        marks = 0.0;
    }
    Student(int u, String n, double m) {
        usn = u;
        name = n;
        marks = m;
    }
    void display() {
        System.out.println("USN: " + usn);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}
public class StudentProg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();
        System.out.println("Default Constructor Output:");
        s1.display();
        System.out.print("\nEnter USN: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String nm = sc.nextLine();
        System.out.print("Enter Marks: ");
        double mk = sc.nextDouble();
        Student s2 = new Student(id, nm, mk);
        System.out.println("\nParameterized Constructor Output:");
        s2.display();
        sc.close();
    }
}
