public class checkPalindrome {

    //Tc -> O(n)
    public static Boolean isPalindrome(String str)
    {
        for(int i=0; i<str.length()/2; i++)
        {
           
            if(str.charAt(i)==str.charAt(str.length()-1-i))
            {
                System.out.println("palindrome");
                return true;
                
            }
            
        }
        System.out.println("not palindrom!");
        return false;
    }

    public static void main(String args[])
    {
        String str = "0110";
        
        isPalindrome(str);
    }
    
}
