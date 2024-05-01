public class TilingProblem {

    public static int tiling_Problem(int n)
    {
        //base case
        if(n == 0 || n == 1){
            return 1;
        }
        //choice -->kaam
        //vertical
        int vertical = tiling_Problem(n-1);

        //horizontal
        int horizontal = tiling_Problem(n-2);

        //total ways
        int totalWays = vertical+horizontal;

        return totalWays;

    }
    public static void main(String[] args) {
        System.out.println(tiling_Problem(5));
    }
}
