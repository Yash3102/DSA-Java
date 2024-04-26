public class FindLastOcurrenceofElement {

    public static int Find_lastOccurence(int arr[], int key,int i)
    {
        if(i <= 0)
        {
            return -1;
        }

        if(arr[i] == key)
        {
            return i;
        }  

        return Find_lastOccurence(arr, key, i-1);

        
    }
    public static void main(String[] args) {
        //int arr[] = {8,3,6,9,5,10,2,5,3};
        int arr[] = {1,2,3,4,5,5,5,6,7,10};
        System.out.println(Find_lastOccurence(arr, 5, arr.length-1));
    }
}
