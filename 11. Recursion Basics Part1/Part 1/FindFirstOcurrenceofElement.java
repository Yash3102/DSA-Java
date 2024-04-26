public class FindFirstOcurrenceofElement {
    public static int FindElement(int arr[], int key, int i)
    {
        
        if(arr[i] == key)
        {
            return i;
            
        }

        //base case 
        if(i >= arr.length-1)
        {
            return -1;
        }

        return FindElement(arr, key , i+1);

    }

    public static void main(String args[])
    {
        int arr[] = {8,3,6,9,5,10,2,5,3};

        System.out.println(FindElement(arr, 3, 0));

    }
}
