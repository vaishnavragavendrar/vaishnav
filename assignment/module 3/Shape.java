class Shape {
    void area() {
        System.out.println("Area calculation not defined.");
    }
}
class Circle extends Shape {
    double radius;
    Circle(double r) {
        radius = r;
    }
    @Override
    void area() {
        double result = 3.1416 * radius * radius;
        System.out.println("Area of Circle: " + result);
    }
}
class Rectangle extends Shape {
    double length, width;
    Rectangle(double l, double w) {
        length = l;
        width = w;
    }
    @Override
    void area() {
        double result = length * width;
        System.out.println("Area of Rectangle: " + result);
    }
}
public class PolymorphismProg {
    public static void main(String[] args) {
        Shape s1 = new Circle(5);
        Shape s2 = new Rectangle(4, 6);
        s1.area();
        s2.area();
    }
}
