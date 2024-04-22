public class Inheritance {
    public static void main(String[] args) {
        Fish sharks = new Fish();
        sharks.eat(); //method of Animals class
        //sharks.breathe(); //method of Animals class
        sharks.swim();  
    }
}

//Parents class or base class
class Animals{
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathes");
    }
}

//Derived class
class Fish extends Animals{
    int fins;
    
    void swim()
    {
        System.out.println("Swim..");
    }
}
