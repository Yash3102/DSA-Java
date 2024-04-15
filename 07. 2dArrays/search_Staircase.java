public class search_Staircase {

    public static Boolean Staircase_Search(int matrix[][], int key)
    {
        int row =0;
        int col = matrix[0].length-1;
        while(row < matrix.length && col>=0)
        {
            if(matrix[row][col] == key)
            {
                System.out.println("found ("+ row +"," + col + ")");
                return true;
            }
            else if(key<matrix[row][col])
            {
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("key not found!!");
        return false;
        
        
    }

    public static Boolean HWQuestion_Staircase_As_Bottom_approach(int matrix[][] , int key)
    {
        // 10,    20,   K(30), 40  
        // 15,    25,   [35],  45
        //[27],  [29],  [37],  48
        //(32),   33,    39,   50 
     
        int row = matrix.length-1;
        int col = 0;

        while(col<matrix.length && row>=0)
        {
            if(matrix[row][col] == key)
            {
                System.out.println("found at ("+row+","+col+")");
                return true;
            }
            else if(key<matrix[row][col])
            {
                row--;
            }
            else{
                col++;
            }
        }
        System.out.println("not found");
        return false;

    }
    public static void main(String args[])
    {
        int matrix [][] ={{10,20,30,40},
                          {15,25,35,45},
                          {27,29,37,48},
                          {32,33,39,50}};

        Staircase_Search(matrix,33 );
        HWQuestion_Staircase_As_Bottom_approach(matrix, 30);
    }
}
