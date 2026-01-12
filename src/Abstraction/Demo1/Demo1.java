package Abstraction.Demo1;

abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing");
    }
}
public class Demo1 {
    public static void main (String[] args){
        Shape s = new Circle();
        s.draw();
    }
}
