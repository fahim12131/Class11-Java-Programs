//reverse_a_permutation
import java.util.*;
public class reverse_a_permutation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a=in.nextInt();
        int r,max,tempj=0,j;
        for(int b=1;b<=a;b++){
        r = in.nextInt();             //taking range of the input
        int arr[] = new int[r];
        for(int i=0;i<r;i++)              //taking input array
            arr[i] = in.nextInt();
        for(int i=0;i<r;i++)              //iterating through the array
        {
            max=0;
            for( j=i;j<r;j++)             //iterating from that number to the end
            {
                if(arr[j]>max)            //finding max for that segment 
                {
                        max=arr[j];
                        tempj=j;        
            }
        }
            if(max==arr[i])               //checking if max is 1st element of segment
                System.out.print(arr[i]+" ");
            else
                {//if not 1st element then reverse segment(this will happen only once)
                for(int k=tempj;k>=i;k--)
                System.out.print(arr[k]+" ");
            for(int t=tempj+1;t<r;t++) // then print the rest of the elements 
                System.out.print(arr[t]+" ");
            break;
            }
        }
    }
    }
}
