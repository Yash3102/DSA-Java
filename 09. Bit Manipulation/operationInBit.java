public class operationInBit {

    //Get ->(i)th bit
    public static void Get_bit(int n, int i )
    {
        int bitmask = 1<<i;

        if((n & bitmask) == 0)
        {
            System.out.println(i+" bit is : 0");
        }
        else{
            System.out.println(i+" bit is : 1");
        }
    }

    //Set ->(i)th bit to 1.
    public static void Set_bit(int n, int i)
    {
        int bitmask = 1<<i;

        System.out.println(n | bitmask);
    }

    //clear ->(i)th bit to 0.
    public static void Clear_bit(int n, int i)
    {
        int bitmask =~(1<<i);

        System.out.println(n & bitmask);
    }

    public static void Update_bit(int n, int i, int bit)
    {
        if(bit == 0)
        {
            Clear_bit(n, i);
        }
        else{
            Set_bit(n, i);
        }
    }

    public static void main(String args[])
    {
        Get_bit(15, 2);
        Set_bit(10, 2);
        Clear_bit(10, 1);
        Update_bit(10, 1, 0);
    }
    
}
