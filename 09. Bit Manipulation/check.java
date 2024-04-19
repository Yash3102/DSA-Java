public class check {
    public static void Getith_bit(int n, int i)
    {
        int bitmask = 1<<i;

        if((n & bitmask) == 0)
        {
            System.out.println("0");
        }
        else{
            System.out.println("1");
        }
        
    }

    public static void Setith_bit(int n, int i)
    {
        int bitmask = 1<<i;

        System.out.println(n | bitmask);
    }

    public static void Clearith_bit(int n , int i)
    {
        int bitmask = ~(1<<i);

        System.out.println(n & bitmask);
    }

    public static void Updateith_bit(int n, int i, int bit)
    {
        if(bit == 0)
        {
            Setith_bit(n, i);
        }
        else{
            Clearith_bit(n, i);
        }
    }

    public static void clearrangeofbit(int n ,int i ,int j)
    {
        int a = (~0)<<j+1;
        int b = (1<<i)-1;

        int bitmass = a | b;

        System.out.println(n & bitmass);
    }

    public static Boolean check(int n)
    {
        if((n & (n-1)) == 0)
        {
            return true;
        }
        else{
            return false;
        }

    }
    
    public static void main(String args[])
    {
        Getith_bit(15, 2);
        Setith_bit(10, 2);
        Clearith_bit(10, 1);
        Updateith_bit(10, 1, 1);
        clearrangeofbit(10, 2, 4);
        System.out.println(check(8));
        
    }
    
}
