import java.util.*;
public class length_of_last_word
{
    public static int lengthOfLastWord(String s) 
    {
        s=s.trim();
        int li=s.lastIndexOf(" ");
        return s.substring(li+1,s.length()).length();
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        String s=in.nextLine();
        System.out.println(lengthOfLastWord(s));
    }
}