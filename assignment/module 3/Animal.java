class Animal {
    void sound() {
        System.out.println("Animals produce sounds.");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}
public class InheritanceProg {
    public static void main(String[] args) {
        Dog pet = new Dog();
        pet.sound();  
        pet.bark();  
    }
}
