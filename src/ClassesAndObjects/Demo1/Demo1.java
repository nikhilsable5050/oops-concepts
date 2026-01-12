package ClassesAndObjects.Demo1;

import java.sql.SQLOutput;

class Student {
    int id;
    String name;

    void display(){
        System.out.println(id + " " + name);
    }
}

public class Demo1 {
    public static void main (String[] args){
        Student s = new Student();
        s.id = 1;
        s.name = "Nikhil";
        s.display();
    }

}
