public class BinaryStringProblem {

    public static void BinaryPlace(int n, int lastplace, String str)
    {
        if(n == 0)
        {
            System.out.println(str);
            return;
        }
        
        //kaam
        if(lastplace == 0)
        {
            BinaryPlace(n-1, 0, str+"0");
            BinaryPlace(n-1, 1, str+"1");
        }
        else{
            BinaryPlace(n-1, 0, str+"0");
        }

        /*BinaryPlace(n-1, 0, str+"0");
        if(lastplace == 0)
        {
            BinaryPlace(n-1, 1, str+"1");
        }*/

    }
    public static void main(String args[])
    {
        BinaryPlace(3, 0, "");
    }
    
}
