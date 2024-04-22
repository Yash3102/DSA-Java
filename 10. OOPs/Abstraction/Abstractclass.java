public class Abstractclass {
    public static void main(String[] args) {
        /*Horse h = new Horse();
        h.eat();
        h.walk();*/

        //Animal-> chicken 

        Chicken c = new Chicken();
        c.eat();;
        c.walk();
    }
}

//abstract class
abstract class Animal{
    String color;
    
    void eat()//non abstract method
    {
        System.out.println("animals eats");
    }

    abstract void walk(); //abstract method

    Animal(){
        System.out.println("animal Constructor");
    }
}

class Horse extends Animal{
    void walk() //compolsory to implement blc of abstracte method
    {
        System.out.println("Horse walk by 4 legs");
    }

    Horse(){
        System.out.println("Horse Constructor");
    }
}

class Chicken extends Animal{
    void walk(){
        System.out.println("Chicken walk by 4 legs");
    }

    Chicken()
    {
        System.out.println("chicken constructor");
    }
}