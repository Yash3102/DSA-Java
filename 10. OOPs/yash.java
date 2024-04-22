public class yash {
    public static void main(String[] args) {
        new Moon();
    }
}

class Univers{
    static{
        System.out.println("1");
    }

    Univers(){
        System.out.println("2");
    }

    {
        System.out.println("3");
    }
}

class Moon extends Univers{
    
    {
        System.out.println("4");
    }

    Moon(){
        super();
        System.out.println("5");
    }
}
