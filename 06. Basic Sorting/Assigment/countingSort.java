package Assigment;
import java.util.*;

public class countingSort {

    public static void CountingSort(int num[])
    {
        //largest value for range 
        int Largest = Integer.MIN_VALUE;
        for(int i =0; i<num.length; i++)
        {
            Largest = Math.max(Largest, num[i]);
        }

        //frequecny array (count arr)
        int count[] = new int[Largest+1];
        for(int i=0; i<num.length; i++)
        {
            count[num[i]]++;
        }


        //sorting
        int a =0;
        for(int i = 0; i<count.length; i++)
        {
            while(count[i]>0)
            {
                num[a]=i;
                a++;
                count[i]--;
            }
        }
    }
    public static void printArray(Integer num[])
    {
        for(int i =0; i<num.length; i++)
        {
            System.out.print(num[i]+" ");
        }
    }
    public static void main(String args[])
    {
        Integer num[] = {3,6,2,1,8,7,4,5,3,1};
        
        //CountingSort(num);
        //printArray(num);

        //System.out.println();
        //System.out.println("Using Inbuit Sorting Function");
        //Arrays.sort(num);
        //printArray(num);
        
        System.out.println();
        System.out.println("Reverse ");
        
        Arrays.sort(num,Collections.reverseOrder());
        printArray(num);

    }
}
