//both method normal and optimize
public class PrintXpowerN {

    //tc -> O(n)
    public static int Pow(int x , int n)
    {
        if(n == 1)
        {
            return x;
        }

        return x * Pow(x,n-1);
    }

    //tc -> O(log(n))
    public static int OptimizeMethod_Pow(int x, int n)
    {
        if(n == 1)
        {
            return x;
        }

        //int halfpower = OptimizeMethod_Pow(x, n/2) * OptimizeMethod_Pow(x, n/2); due to this time complexity is same.

        int halfpower = OptimizeMethod_Pow(x, n/2);
        int halfpowerSq = halfpower*halfpower;

        //n is odd 2^5 = (2)*(2^2)*(2^2)
        if(n % 2 != 0)
        {
            halfpowerSq = x * halfpowerSq;
        }

        return halfpowerSq;
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 10;

        //System.out.println(Pow(x, n));

        System.out.println(OptimizeMethod_Pow(x, n));
    }
}
