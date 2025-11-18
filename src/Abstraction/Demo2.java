package Abstraction;

abstract class CoffeeMachine {
    abstract void makeCoffee();

    void powerOn() {
        System.out.println("Machine is ON");
    }
}

class MyCoffeeMachine extends CoffeeMachine {
    @Override
    void makeCoffee() {
        System.out.println("Making Cappuccino");
    }
}

public class Demo2 {
    public static void main(String[] args) {
        CoffeeMachine c = new MyCoffeeMachine();  // correct object creation

        c.powerOn();      // call parent class method
        c.makeCoffee();   // call implemented abstract method
    }
}
