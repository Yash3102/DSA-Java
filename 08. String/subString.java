public class subString {

    public static String subString(String str, int st, int ed){
        String substr = "";
        for(int i=st; i<ed; i++){
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String args[])
    {
        String str = "HelloWorld";
        System.out.println(subString(str, 0, 5));

        //easy method or inbuilt function
        System.out.println(str.substring(0, 5));
    }
}
