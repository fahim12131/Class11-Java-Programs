//A - Ultra-Fast Mathematician
import java.util.*;
public class Solution61A {
    public static void main(String args[])
    {
       Scanner in = new Scanner(System.in);
       String str1 = in.nextLine();
       String str2 = in.nextLine();
       for(int i = 0;i<str1.length();i++)
       {   
           if(str1.charAt(i)==str2.charAt(i))
            System.out.print(0);
        else
            System.out.print(1);
       }
    }
    
}
