public class diagonalSum {

    //Tc -> (O(n^2))
    public static void diagonal_Sum_In_Array(int matrix[][])
    {
        int sum = 0;

        for(int i=0; i<matrix.length; i++)
        {
            for(int j=0; j<matrix[0].length; j++)
            {
                if(i == j)
                {
                    sum += matrix[i][j];
                }
                else if(i+j == matrix.length-1)
                {
                    sum += matrix[i][j];
                }
            }
        }

        System.out.println("sum is:" +sum);
    }


    // Tc -> (O(n))
    public static void diagonal_Sum_In_Array_optimize(int matrix[][])
    {
        int sum = 0;

        for(int i =0; i<matrix.length; i++)
        {   //pd
            sum += matrix[i][i];
            //sd
            sum += matrix[i][matrix.length-i-1];
        }
        System.out.println("sum is :"+sum);
    }

    public static void main(String args[])
    {
        int matrix [][] ={{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}};

        diagonal_Sum_In_Array(matrix);
        diagonal_Sum_In_Array_optimize(matrix);
    }

    
}
