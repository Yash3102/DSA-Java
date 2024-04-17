//for a given string print largest string as per (Lexicographic)
// Tc -> O(x*N) 
//where x-> largest string lenght and N-> no of string to compare
public class largestString {
    public static void main(String args[])
    {
        String fruits[] = {"apple", "mango" ,"banana"}; 

        String largest = fruits[0];

        for(int i =1; i<fruits.length; i++)
        {
            if(largest.compareToIgnoreCase(fruits[i])<0)
            {
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}
