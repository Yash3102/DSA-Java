public class FibonacciSeries {

    public static int fibonacci(int n)
    {
        if(n == 0 || n == 1)
        {
            return n;
        }
        int fibNm1 = fibonacci(n-1);
        int fibNm2 = fibonacci(n-2);
        int fibN = fibNm1 + fibNm2;
        return fibN;
    }
    public static void main(String[] args) {
        int n = 5;

        System.out.println(fibonacci(n));
        
    }
    
}
