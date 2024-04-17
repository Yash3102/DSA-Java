package Assigment;
import java.util.*;

//Anagrams String -> 
//let s1 = "race" and s2 = "care"
//(char) present in both string have same alphabet in different order is called --

public class check_Anagrams {

    
    public static void main(String args[])
    {
        String str = "race";
        String str1 = "care";

        //convert to lowercase (no further check for Upercase)
        str = str.toLowerCase();
        str1 = str1.toLowerCase();

        if(str.length() == str1.length())
        {
            //convert string to chararray
            char [] strcharArray = str.toCharArray();
            char [] str1charArray = str1.toCharArray();

            //sortArray 
            Arrays.sort(strcharArray);
            Arrays.sort(str1charArray);

            //check equals
            boolean result = Arrays.equals(strcharArray, str1charArray);

            if(result == true)
            {
                System.out.println("Anagrams string");
            }
            else{
                System.out.println("not Anagram");
            }

            

        }
        else{
            System.out.println("Not possible to compare");
        }

        
        
    }
}
