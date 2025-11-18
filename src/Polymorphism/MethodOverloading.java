package Polymorphism;
//compile time poly

class MathUtil {
    int add (int a, int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
}
public class MethodOverloading {
    public static void main (String[] args){
        MathUtil m = new MathUtil();
        System.out.println(m.add(1,2));
        System.out.println(m.add(1,2,3));
    }
}
