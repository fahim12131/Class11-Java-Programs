//accept a string that terminates at eather "." or "?" or "!" and check the word
//starting with consonants and print them in descending order and the remaining 
//words in reverse form.
import java.util.*;
public class String_modification {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter string");
        String str = in.nextLine();
        str=str.toUpperCase();
        if(str.charAt(str.length()-1)=='.' || str.charAt(str.length()-1)=='?' ||str.charAt(str.length()-1)=='!')
        {
            str=str.substring(0,str.length()-1);
            String[] st = str.split(" ");
            for(int i=0;i<st.length;i++)
            {
                if(st[i].charAt(0)=='A'|| st[i].charAt(0)=='E'||st[i].charAt(0)=='I'||st[i].charAt(0)=='O'||st[i].charAt(0)=='U')
                {
                    for(int j=st[i].length()-1;j>=0;j--)
                        System.out.print(st[i].charAt(j));
                    System.out.print(" ");
                }
                else
                {
                    for(int j=90;j>=65;j--)
                    {
                        if(st[i].indexOf((char)j)!=-1)
                            System.out.print((char)j);
                    }
                    System.out.print(" ");
                }
            }
        }
        else
            System.out.println("Invalid String");
    }
}
