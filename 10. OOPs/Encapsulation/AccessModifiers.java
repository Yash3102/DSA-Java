public class AccessModifiers {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();
        myAcc.setPass("abcder");
        //System.out.println(myAcc.Password);
        //get error
    }
}

class BankAccount{
    public String username;
    private String Password;

    public void setPass(String Password)
    {
        this.Password = Password;
    }
}