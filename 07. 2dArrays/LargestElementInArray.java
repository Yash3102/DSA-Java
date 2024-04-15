import java.util.*;
public class LargestElementInArray {

    public static void largest_Num_InArray(int matrix[][])
    {
        int largest_Numb = Integer.MIN_VALUE;
        for(int i =0; i<matrix.length; i++)
        {
            for(int j =0; j<matrix[0].length; j++)
            {
                if(matrix[i][j]>largest_Numb)
                {
                    largest_Numb = matrix[i][j];
                }
            }
        }
        System.out.println("largest number: "+largest_Numb);

    }
    public static void main(String args[])
    {
        int matrix[][] = new int[3][3];
        Scanner sc =new Scanner(System.in);

        for(int i =0; i<matrix.length; i++)
        {
            for(int j =0; j<matrix[0].length; j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }


        for(int i =0; i<matrix.length; i++)
        {
            for(int j =0; j<matrix[0].length; j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        largest_Num_InArray(matrix);
    }
    
}
