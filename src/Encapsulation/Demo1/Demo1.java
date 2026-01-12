package Encapsulation.Demo1;

class Account {
    private double balance;

    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }
}

public class Demo1 {
    public static void main (String[] args){
        Account acc = new Account();
        acc.setBalance(5000000);
        System.out.println(acc.getBalance());
    }
}
