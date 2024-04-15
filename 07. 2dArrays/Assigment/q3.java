package Assigment;

public class q3 {

    public static void matrix_transposed(int matrix[][])
    {
        int Tmatrix[][] = new int[3][2];
        for(int i =0; i<matrix.length; i++)
        {
            for(int j =0; j<matrix[0].length; j++)
            {
                Tmatrix[j][i] =matrix[i][j];

            }
        }

        for(int i =0; i<Tmatrix.length; i++)
        {
            for(int j =0; j<Tmatrix[0].length; j++)
            {
                System.out.print(Tmatrix[i][j]+" ");

            }
            System.out.println();
        }
        
    }
    public static void main(String args[])
    {
        int matrix[][] ={{1,2,3},{4,5,6}};
        matrix_transposed(matrix);

    }
    
}
