package Polymorphism;

class Payment {
    void pay(){
        System.out.println("Paying in general mode");
    }
}
class UPI extends Payment {
    @Override
    void pay(){
        System.out.println("Paying using UPI");
    }
}
class Card extends Payment {
    @Override
    void pay(){
        System.out.println("Paying using Card");
    }
}

public class Demo2 {
    public static void main (String[] args){
        Payment p;
        p = new UPI();
        p.pay();

        p = new Card();
        p.pay();
    }
}
