package Polymorphism;

class Animal {
    void sound(){
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    void sound(){
        System.out.println("Bark");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Animal a = new Dog(); // Parent reference, Child object  // upcasting
        a.sound();              // Bark (runtime polymorphism)
    }
}
