//371 = 3^3 + 7^3 + 1^3 
import java.util.*;
public class recursive_armstrong_Hard {
    public static boolean check(int x, int n, int dig) //pass (n, n, (""+n).length())
    {
        return x == 0 ? n == 0 : check(x/10, ((int)(n - Math.pow(x%10, dig))), dig);
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(check(n, n, (""+n).length()));
    }
}
