//371 = 3^3 + 7^3 + 1^3 
import java.util.*;
public class recursive_armstrong_Hard {
    public static boolean check(int a,int temp,int temp2,int n,int sum)
    {
        if(a==temp)
        {
            while(temp2>0)
            {
                n++;
                temp2/=10;
            }
        }
        if(temp==0 && a==sum) return true;
        else if(temp==0 && a!=sum) return false;
        else
        {
            sum=sum+(int)Math.pow(temp%10,n);
            return check(a,temp/10,temp2,n,sum);
        }

    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(check(n,n,n,0,0));
    }
}
