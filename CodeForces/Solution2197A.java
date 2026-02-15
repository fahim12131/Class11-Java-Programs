//Friendly numbers
import java.util.*;
public class Solution2197A {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int tc=in.nextInt();
        int a;
        int temp,sum,i,k=0;
        for(int p=1;p<=tc;p++){
            a=in.nextInt();
        for(i=a+1;i<=a+90;i++)
        {
            temp=i;
            sum=0;
            while(temp>0)
            {
                sum = sum + temp%10;
                temp=temp/10;
            }
            if(i-sum == a)
                k++;
        }
        System.out.println(k);
        k=0;
    }
    }
}