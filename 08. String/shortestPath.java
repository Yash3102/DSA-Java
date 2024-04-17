public class shortestPath {

    public static void Shortest_Path(String str)
    {
        int x =0;
        int y =0;
        
        double SD;

        for(int i =0; i<str.length(); i++)
        {
            char dir = str.charAt(i);
            if(dir == 'N')
            {
                y++;
            }
            else if(dir == 'E')
            {
                x++;
            }
            else if(dir == 'W')
            {
                x--;
            }
            else{
                y--;
            }
        }

       int X2 = x*x;
       int Y2 = y*y;
       SD = Math.sqrt(X2+Y2);
       System.out.println(SD);

    }
    public static void main(String args[])
    {
        String str = "WNEENESENNN";
        Shortest_Path(str);
    }
}
