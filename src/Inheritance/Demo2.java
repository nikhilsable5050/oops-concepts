package Inheritance;

class Phone {
    void call(){
        System.out.println("Phone can make calls");
    }
}
class SmartPhone extends Phone {
    void camera(){
        System.out.println("It takes photo");
    }

}
public class Demo2 {
    public static void main (String[] args){
        SmartPhone s = new SmartPhone();
        s.call(); //inherited
        s.camera(); //own
    }
}
