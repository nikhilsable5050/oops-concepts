package Abstraction;

abstract class Bike {
    abstract void start(); //no body

    void stop(){
        System.out.println("Bike stopped");
    }
}

class Honda extends Bike
{
    @Override
    void start(){
        System.out.println("Honda starts with self start button");
    }
}

public class Demo {
    public static void main (String[] args){
        Honda b = new Honda();
        b.start();
        b.stop();
    }

}
