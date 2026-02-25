class Display {
    void show(int a) {
        System.out.println("Integer value: " + a);
    }
    void show(String text) {
        System.out.println("String value: " + text);
    }}
class AdvancedDisplay extends Display {
    @Override
    void show(int a) {
        System.out.println("Modified integer value: " + (a * 2));
    }}
public class Methodiff {
    public static void main(String[] args) {
        Display d1 = new Display();
        d1.show(10);
        d1.show("Java");
        Display d2 = new AdvancedDisplay();
        d2.show(10);  
    }
}
