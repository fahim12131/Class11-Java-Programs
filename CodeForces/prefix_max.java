//https://codeforces.com/problemset/problem/2185/B
import java.util.*;
public class prefix_max
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tc=in.nextInt();
        while(tc-->0)
            {
                int n=in.nextInt();
                int arr[]= new int[n];
                for(int i=0;i<n;i++) arr[i]=in.nextInt();
                int max=arr[0];
                for(int i=0;i<n;i++)
                {
                    if(max<arr[i]) max=arr[i];
                }
                System.out.println(n*max+" ");
            }
    }
}