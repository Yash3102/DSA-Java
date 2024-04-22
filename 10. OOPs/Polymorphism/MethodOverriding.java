public class MethodOverriding {
    public static void main(String[] args) {
        Deer d = new Deer();
        d.eat();
    }
}

class Animals {
    void eat(){
        System.out.println("eat anything");
    }
}

class Deer extends Animals{
    void eat(){
        System.out.println("eat grass");
    }
}