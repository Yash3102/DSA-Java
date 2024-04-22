public class GettersAndSetters {
    public static void main(String[] args) {
        Pen p1 =new Pen();
        p1.setTip(18);
        System.out.println(p1.getTip());
    }
}

class Pen{
    private int tip;

    void setTip(int tip)
    {
        this.tip = tip;
    }

    int getTip()
    {
        return this.tip;
    }
}