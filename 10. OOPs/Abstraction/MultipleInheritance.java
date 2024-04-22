public class MultipleInheritance {
    public static void main(String[] args) {
        Bear b = new Bear();
        b.Ceat();
        b.Eeat();
    }
}

interface Carnivore{
    void Ceat();
}

interface Herbivore{
    void Eeat();
}

class Bear implements Carnivore,Herbivore{
    public void Ceat(){
        System.out.println("eats mass");
    }

    
    public void Eeat() {
        System.out.println("eats grass");
        
    }
}