package Assigment;
import java.util.*;
public class q1 {

    
    public static void main(String args[])
    {
        int matrix[][] = new int[2][3];
        Scanner sc =new Scanner(System.in);
        for(int i=0; i<matrix.length; i++ )
        {
            for(int j =0; j<matrix[0].length; j++)
            {
                matrix[i][j]= sc.nextInt();
            }
        }

        

        for(int i=0; i<matrix.length; i++ )
        {
            for(int j =0; j<matrix[0].length; j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        // int matrix[][] = {{4,7,8},
          //               {8,8,7}};
        int count =0;
        for(int i=0; i<matrix.length; i++ )
        {
            
            for(int j =0; j<matrix[0].length; j++)
            {
                if(matrix[i][j] == 7)
                {
                    count++;
                }
                
                
                
               
            }
            
            
        }
        System.out.println(count);
    }
    
}
