//https://codeforces.com/problemset/problem/2182/B
import java.util.*;
public class new_year_cake {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        if (!in.hasNextInt()) return;
        int tc = in.nextInt();
        while (tc-- > 0) {
            int a=in.nextInt();
            int b=in.nextInt();
            int c=b;
            int d=a;
            int col=1,ncol=1,nl=0,nl2=0;
            for(int i=1;i<1000000;i*=2)
            {
                a=(col%2!=0) ? a-i : a;
                b=(col%2==0) ? b-i : b;
                col++;
                if(a<0 || b<0)
                    break;
                nl++;
            }
            for(int i=1;i<1000000;i*=2)
            {
                c=(ncol%2!=0) ? c-i : c;
                d=(ncol%2==0) ? d-i : d;
                ncol++;
                if(c<0 || d<0)
                    break;
                nl2++;
            }
            System.out.println(Math.max(nl,nl2));
        }
    }
}
