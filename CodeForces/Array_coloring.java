//https://codeforces.com/contest/2191/problem/A
import java.util.Scanner;
public class Array_coloring
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int tc=in.nextInt();
        while(tc-->0)
        {
            int n= in.nextInt();
            int arr[] = new int[n];
            arr[0]=in.nextInt();
            int b;
            String str="Yes";
            if(arr[0]%2==0)
            {
                for(int i=1;i<n;i++)
                {
                    b=(i%2!=0) ? 1 : 0;
                    if(in.nextInt()%2!=b) str = "No";
                }
            }
            if(arr[0]%2!=0)
            {
                for(int i=1;i<n;i++)
                {
                    b=(i%2==0) ? 1 : 0;
                    if(in.nextInt()%2!=b) str = "No";
                }
            }   
            System.out.println(str);
        }
    }
}
