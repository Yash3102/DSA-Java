public class bubbleSorting {

    public static void BubbleSort(int number[])
    {   
        //outer loop for turns 
        for(int turns=0; turns<(number.length-1); turns++ )
        {
            int swap =0;//for count swap

            //inner loop for compare
            for(int j =0; j<(number.length-1-turns); j++)
            {
                if(number[j]>number[j+1])
                {
                    //swaping
                    int temp = number[j];
                    number[j] = number[j+1];
                    number[j+1] = temp;
                    swap++;
                }

                
            } 
            // if swap = 0 then we considered as best case
            if(swap == 0)
            {
                System.out.println("Best Case Already sorted");
                break;
            }
            
        }
         
    }

    public static void PrintSort_number(int number[])
    {
        for(int i=0; i<number.length; i++)
        {
            System.out.print(number[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        int number [] = {1,2,3,4,5};
        BubbleSort(number);
        PrintSort_number(number);
        
    }
    
}
