package Assigment;


public class q2 {
    public static void PrintSum(int matrix[][])
    {
        int sum =0;
        for(int i =1; i<matrix.length-1; i++)
        {
            for(int j =0; j<matrix[0].length; j++)
            {
                
               sum += matrix[i][j];
            }
        }
        System.out.println(sum);
    }
    public static void main(String args[])
    {
        int arr[][] ={{1,4,9},{11,4,3},{2,2,3}};

        PrintSum(arr);


    }
    
}
