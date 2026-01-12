package Polymorphism.Demo1;

class Vehicle {
    void start(){
        System.out.println("Vehicle starts");
    }
}

class Bike extends Vehicle {
    void start(){
        System.out.println("Bike starts");
    }
}

public class Demo1 {
    public static void main (String[] args){
        Vehicle v = new Bike(); //parent  refernce
        v.start();

    }
}
