import java.util.*;
public class Solution2193B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();             //taking range of the input
        int max,tempj=0;
        int j;
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
