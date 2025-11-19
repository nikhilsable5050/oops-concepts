package Encapsulation;

class BankAccount {
    private int balance; //hidden

    public void setBalance (int balance){
        this.balance = balance;
    }
    public int getBalance(){
        return balance;
    }
}


public class Demo2 {
    public static void main (String[] args){
        BankAccount acc = new BankAccount();
        acc.setBalance(69);
        System.out.println(acc.getBalance());
    }
}
