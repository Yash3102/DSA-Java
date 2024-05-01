package Assignement;

public class rec_Question2 {
    static String digit[] = {"zero","one","two","three","four","five","six","seven","eight","nine","ten"};

    public static void printdigit(int number)
    {
        if(number == 0)
        {
            return;
        }

        int lastDigit = number%10;
        printdigit(number/10);
        System.out.print(digit[lastDigit]+" ");
    }
    /*public static void convert_IntToStr(int number)
    {
        
            
        int rem = number%10;

        if(rem == 0)
        {
            return;
        }
        if(rem == 1){
            System.out.print(" one ");
        }
        else if(rem == 9)
        {
            System.out.print(" nine ");
        }
        else if(rem == 4)
        {
            System.out.print(" four ");
        }
        else if(rem == 7)
        {
            System.out.print(" seven ");
        }

        convert_IntToStr(number/10);
    
        
    }*/
    public static void main(String[] args) {
        int number = 1947;

        //convert_IntToStr(number);
        int revnu = 0;

        /*while(number>0)
        {
            int rev = number%10;

            revnu = rev+revnu*10;

            number = number / 10;

        }

        System.out.println(revnu);*/

        printdigit(number);
       
        
    }
}
