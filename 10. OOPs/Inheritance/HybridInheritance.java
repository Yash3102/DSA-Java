public class HybridInheritance {
    public static void main(String[] args) {
        Sharks s = new Sharks();
        Peacock p = new Peacock();
        Dog d = new Dog();

        s.eat();
        p.eat();
        d.eat();
        s.swim();
        
    }
}

class Animals{
    String color;

    void eat(){
        System.out.println("eats");
    }
}

class Fish extends Animals{
    int fins;

    void swim(){
        System.out.println("swimm");
    }
}

class Bird extends Animals{
    void fly(){
        System.out.println("fly");
    }
}

class Mammal extends Animals{
    void run(){
        System.out.println("run");
    }
}

class Sharks extends Fish{
    String name;
}

class Peacock extends Bird{
    String sound;
}

class Dog extends Mammal{
    int legs;
}