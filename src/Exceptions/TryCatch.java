package Exceptions;

public class TryCatch {
    public static void main (String[] args){
        int a = 10;
        int b = 0;

        try {
            int result = a / b; //this throw arithmetic exception
            System.out.println("result :" + result);
        }
        catch (ArithmeticException e){


            System.out.println("Cannot divide by zero");
        }
        System.out.println("Program continues....");
    }
}
