public class spiralMatrix {

    public static void PrintSpiral_Matrix(int matrix[][])
    {
        int startRow = 0;
        int startColoumn = 0;
        int endRow = matrix.length-1; //n-1
        int endColoumn = matrix[0].length-1; //m-1

       while(true)
       {    //top
            for(int j =startColoumn; j<=endColoumn; j++)
            {
                System.out.print(matrix[startRow][j]+" ");
            }


             //right
            for(int i = startRow+1; i<=endRow; i++)
            {
                System.out.print(matrix[i][endColoumn]+" ");
            }


             //bottom
            for(int j = endColoumn-1; j>=startColoumn; j--)
            {
                System.out.print(matrix[endRow][j]+" ");
            }

            //left
            for(int i = endRow-1; i>=startRow+1; i-- )
            {
                System.out.print(matrix[i][startColoumn]+" ");
            }
        
            startRow++;
            endRow--;
            startColoumn++;
            endColoumn--;

       }
    }
    public static void main(String args[])
    {
        int matrix [][] ={{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}};

        PrintSpiral_Matrix(matrix);
    }
}
