public class CopyConstructor {
    public static void main(String[] args) {
        Phone P =new Phone("oneplus");
        Phone P1 =new Phone(P);
        System.out.println(P1.model);
    }
}

class Phone{
    public String model;

    Phone(String model){
        this.model = model;
    }

    Phone(Phone p){
        this.model = p.model;
    }

}