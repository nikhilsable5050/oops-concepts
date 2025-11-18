package Polymorphism;

class Plane {
    void fly(){
        System.out.println("Plane is flying");
    }
}
class CargoPlane extends Plane {
    void fly(){
        System.out.println("Cargoplane is flying at low heights");
    }
}
class PassengerPlane extends Plane {
    void fly(){
        System.out.println("PassengerPlane is flying at medium heights");
    }
}
class FighterPlane extends Plane {
    void fly(){
        System.out.println("FighterPlane is flying at great heights");
    }
}

public class Demo {
    public static void main (String[] args){
        CargoPlane cp = new CargoPlane();
        PassengerPlane pp = new PassengerPlane();
        FighterPlane fp = new FighterPlane();

        Plane ref;

        ref = cp;
        ref.fly();

        ref = pp;
        ref.fly();

        ref = fp;
        ref.fly();
    }
}
