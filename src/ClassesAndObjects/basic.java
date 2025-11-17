package ClassesAndObjects;

class Pen {
    String color;
    String type;
    public void write(){
        System.out.println("Writing something");
    }
}

public class basic {
    public static void main (String[] agrs){

        Pen p1 = new Pen();
        p1.color = "red";
        p1.type = "gelpoint";
        p1.write();
    }
}
