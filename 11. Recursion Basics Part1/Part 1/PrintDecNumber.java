//print n to 1 
public class PrintDecNumber {

    public static void PrintDec(int n)
    {   //base case
        if(n == 1)
        {
            System.out.print(n+" ");
            return;
        }
        System.out.print(n+" ");
        PrintDec(n-1);
    }
    public static void main(String[] args) {
        int n = 10;

        PrintDec(n);
    }
}
