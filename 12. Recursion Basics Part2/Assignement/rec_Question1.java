package Assignement;

public class rec_Question1 {
    public static void find_index(int arr[],int key ,int i)
    {
        if(i >arr.length-1)
        {
            //System.out.println("Not found");
            return;
        }

        if(arr[i] == key)
        {
            System.out.print(i+" ");
        }

        find_index(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {3,2,4,5,6,2,7,2,2};

        find_index(arr, 2, 0);
    }
}
