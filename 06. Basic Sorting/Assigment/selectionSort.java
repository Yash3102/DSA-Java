package Assigment;

public class selectionSort {

    public static void SelectionSorting(int num[])
    {
        for(int i =0; i<num.length; i++)
        {
            int minposs = i;
            for(int j =i+1; j<num.length; j++)
            {
                if(num[minposs]>num[j])
                {
                    minposs = j;
                }
            }

            //swap
            int temp = num[minposs];
             num[minposs] = num[i];
             num[i] = temp;
        }
    }
    public static void printArray(int num[])
    {
        for(int i =0; i<num.length; i++)
        {
            System.out.print(num[i]+" ");
        }
    }
    public static void main(String args[])
    {
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        SelectionSorting(arr);
        printArray(arr);
    }
    
}
