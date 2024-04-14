public class countingSorting {

    public static void CountingSort(int arr[])
    {
        int Largest = Integer.MIN_VALUE;

        for(int i =0; i<arr.length; i++)
        {
            Largest = Math.max(Largest, arr[i]);
            /*if(arr[i]>Largest)
            {
                Largest = arr[i];
            }*/
        }
        //counting array (0-largest);
        int count [] = new int[Largest+1];
        for(int i =0; i<arr.length; i++)
        {
            count[arr[i]]++;
           
        }

        

        //sorting
        int a =0;
        for(int i =0; i<count.length; i++)
        {
            while(count[i]>0)
            {
                arr[a]=i;
                a++;
                count[i]--;
            }
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
        int arr [] ={1,4,1,3,2,4,3,7};
        CountingSort(arr);
        Print(arr);
    }
}
