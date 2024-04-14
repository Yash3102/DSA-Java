public class InsertionSorting {

    public static void InsertionSort(int number[])
    {
        for(int i =1; i<number.length; i++)
        {
            int curr =number[i];
            int prev = i-1;

            while(prev >=0 && number[prev]>curr)
            {
                number[prev+1] = number[prev];
                prev--;
            }

            //insertion
            number[prev+1] = curr;

            
        }
    }


    // Prints the array
    public static void Print(int number[])
    {
        for(int i=0; i<number.length; i++)
        {
            System.out.print(number[i]+" ");
        }
        System.out.println();
    }

    public static void main(String args[])
    {
        int number [] ={5,4,1,3,2};
        InsertionSort(number);
        Print(number);
    }
    
}
