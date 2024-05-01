public class Freindspairproblems {

    public static int count(int n)
    {
        //base case
        if(n == 1 || n == 2)
        {
            return n;
        }

        return count(n-1)+(n-1)*count(n-2);
    }
    public static void main(String[] args) {
        int n = 4;

        System.out.println(count(n));
    }
}
