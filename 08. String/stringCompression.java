//tc -> O(n)
public class stringCompression {

    public static String string_Compresed(String str)
    {
        String newstr = "";
        for(int i =0; i<str.length(); i++)
        {
            Integer count = 1;

            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1))
            {
                count++;
                i++;
                
            }

            if(count>1)
            {
               newstr += str.charAt(i)+count.toString();
            }
            else
            {
                newstr += str.charAt(i);
            }

        }
        return newstr;
    }
    public static void string_Compresed_UsingStringBuilder(String str)
    {
        StringBuilder sb = new StringBuilder("");

        for(int i =0; i<str.length(); i++)
        {
            Integer count =1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1))
            {
                count++;
                i++;
            }
            if(count>1)
            {
                sb.append(str.charAt(i)+count.toString());
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb);
    }
    public static void main(String args[])
    {
        String str = "aaabbcccdd";
        System.out.println(string_Compresed(str));


        string_Compresed_UsingStringBuilder(str);
    }
    
}
