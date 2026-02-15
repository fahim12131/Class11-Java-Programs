import java.util.*;
public class DBMB_Array 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int ttc = in.nextInt();
        int n,x,sum1,sum2;
        int arr[];
        for(int tc=1;tc<=ttc;tc++)
        {
            n=in.nextInt();
            sum2=in.nextInt();
            x=in.nextInt();
            arr = new int[n];
            sum1=0;
            for(int i=0;i<n;i++)
                arr[i]=in.nextInt();
            for(int i=0;i<n;i++)
                sum1=sum1+arr[i];
            System.out.println(((sum2-sum1)>=0 && (sum2-sum1)%x==0)? "Yes" : "No");
        }   
    }
}
