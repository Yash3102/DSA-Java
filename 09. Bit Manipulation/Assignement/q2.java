package Assignement;

//swap two number without using third variable
public class q2 {
    public static void main(String[] args) {
        int x = 10;
        int y = 2;

       
        x = x^y;
        y = x^y;
        x = x ^ y;

        System.out.println("x is :"+x);
        System.out.println("y is :"+y);

       
    }
}
