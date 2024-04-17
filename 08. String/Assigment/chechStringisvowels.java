package Assigment;
import java.util.*;
public class chechStringisvowels {

    public static void Count_Vowels_InString(String str)
    {
        int Lcase_vowels =0;

        for(int i=0; i<str.length(); i++)
        {
            
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' ||str.charAt(i) == 'u')
            {
                Lcase_vowels++;
            }
            

        }
        System.out.println(Lcase_vowels);

    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str;
        str = sc.nextLine();

        Count_Vowels_InString(str);
        
        
    }
}
