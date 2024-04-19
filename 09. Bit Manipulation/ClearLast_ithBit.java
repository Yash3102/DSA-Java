public class ClearLast_ithBit {

    public static void ClearlastithBit(int n, int i)
    {
        int bitmask = ~0<<i;

        System.out.println(n & bitmask);

    }
    public static void main(String args[])
    {
        ClearlastithBit(15, 2);
    }
}
