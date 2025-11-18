package Encapsulation;

class Car {
    //prevented direct access by making private
    private String name;
    private int mileage;
    private int cost;

    //give controlled access to setter and getter
    //one function can accept any no. of inputs but cannot return many !
    public void setdata(String name,int mileage,int cost){
        this.name = name;
        this.mileage = mileage;
        this.cost = cost;
    }
    public String getName(){
        return name;
    }
    public int getMileage(){
        return mileage;
    }
    public int getCost(){
        return cost;
    }
}

public class Demo {
    public static void main (String[] args){
        Car c = new Car();
        c.setdata("BMW",9,9000000);
        System.out.println(c.getName());
        System.out.println(c.getMileage());
        System.out.println(c.getCost());
    }
}
