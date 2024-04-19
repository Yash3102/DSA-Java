public class checkEvenOdd {
    public static void EvenOrOdd(int n)
    {
        int bitmask = 1;
        if((n & bitmask) == 0){
            System.out.println("Even");
        }else{
            System.out.println("odd");
        }
    }
    public static void main(String args[])
    {
        EvenOrOdd(3);
        EvenOrOdd(13);
        EvenOrOdd(14);
    }
}
