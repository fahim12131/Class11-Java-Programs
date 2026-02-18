//2167B
import java.util.*;
public class Your_name
{
    public static String check(char[] a, char[] b)
    {
        for(int i=0;i<a.length;i++)
        {
            int temp=0;
            for(int j=0;j<b.length;j++)
            {
                if(a[i]==b[j])
                {
                    b[j]=' ';
                    temp=1;
                    break;
                }
            }
            if(temp!=1) return "No";
        }
        return "Yes";
    }
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        int ttc=in.nextInt();
        while(ttc-->0)
        {
            @SuppressWarnings("unused")
            int n=in.nextInt();
            char[] ar1 = in.next().toCharArray();
            char[] ar2 = in.next().toCharArray();
            System.out.println(Your_name.check(ar1,ar2));
        }
    }
}