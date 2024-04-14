public class selectionSorting {

    public static void SelectionSort(int number[])
    {
        for(int i=0; i<number.length-1; i++)
        {
            // Find the minimum element in unsorted array 
            int minPos = i;
            for(int j =i+1; j<number.length; j++)
            {
                if(number[minPos]>number[j])
                {
                    minPos =j;
                }
            }
            //// Swap the found minimum element with the first
            int temp = number[minPos];
            number[minPos] = number[i];
            number[i] = temp;


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
        int number [] ={5,4,1,2,3};
        SelectionSort(number);
        Print(number);
        
    }
}
