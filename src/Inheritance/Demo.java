package Inheritance;

class CreditCard {
    int cardNo = 12345;
    int pin = 8888;
}

class Hacker extends CreditCard {
    public void showDetails(){
        System.out.println(cardNo);
        System.out.println(pin);
    }
    public void changeDetails(){
        cardNo = 1111;
        pin = 2222;
    }
}

public class Demo {
    public static void main (String[] args){
        Hacker h = new Hacker();
        h.showDetails();
        h.changeDetails();
        h.showDetails();
    }
}
