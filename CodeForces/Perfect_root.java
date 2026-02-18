//https://codeforces.com/problemset/problem/2185/A
import java.util.Scanner;
public class Perfect_root {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int tc=in.nextInt();
        while(tc-->0)
        {
            int n=in.nextInt();
            int i=0;
            while(++i<=n)
                System.out.print(i+" ");
        }
    }
}
