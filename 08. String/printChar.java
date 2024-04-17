public class printChar {

    public static void Printstring(String str)
    {
        for(int i=0; i<str.length(); i++)
        {
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        String Fname = "Yash";
        String Lname = "Patel";

        //Concatenation
        String Fullname = Fname+" "+Lname;

        //sout(Fullname);

        //we want to print one by one 
        Printstring(Fullname);



    }
}
