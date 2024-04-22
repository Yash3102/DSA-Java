public class Interfaces {
    public static void main(String[] args) {
        Queen q = new Queen(); 
        q.moves();
    }
}

interface Chess{
    void moves();
}

class Queen implements Chess{
    public void moves(){
        System.out.println("up,down,left,right,diagonal");
    }
}

class Rook implements Chess{
    public void moves(){
        System.out.println("up,down,left,right");
    }
}

class King implements Chess{
    public void moves(){
        System.out.println("up,down,left,right,diagonal(by 1 step)");
    }
}