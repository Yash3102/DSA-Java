public class SuperKeyword {
    public static void main(String[] args) {
        Horse h = new Horse();
    }
    
}

class Animal{
    public Animal(){
        System.out.println("constructor of Animal");
    }
}

class Horse extends Animal{
    public Horse(){
        
        System.out.println("constructor of horse ");
    }
}