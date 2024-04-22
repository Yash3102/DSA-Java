public class InheritanceTypes {
    public static void main(String[] args) {
        Sharks s1 = new Sharks();
        s1.eat();
        
        s1.swim();

        System.out.println("Heirachical Inher");
        Fish f1 = new Fish();
        Bird b1 = new Bird();
        f1.eat();
        b1.eat();
    }
}

//Parents class
class Animals{
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breaths");
    }
}

//derived class  
//Single Inheritance Animals -- fish
class Fish extends Animals{
    int Fins;

    void swim(){
        System.out.println("swimm..");
    }
}

//derived
//multiple Inheritance animals -- Fish -- sharks
class Sharks extends Fish{
    String name;
}

//Heirechical Inheritance Animals -- (1)Fish
//                                -- (2)Bird
class Bird extends Animals{
    void walk(){
        System.out.println("walks");
    }
}