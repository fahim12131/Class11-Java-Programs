import java.util.Scanner;
public class longest_substring {
        public static int lengthOfLongestSubstring(String s) {
        String sub;
        int num,max=0;
        for(int i=0;i<s.length();i++)
        {
            sub = Character.toString(s.charAt(i));
            num=1;
            for(int j=i+1;j<s.length();j++)
            {
                if(sub.indexOf(s.charAt(j))==-1){
                    num++;
                    sub=sub+Character.toString(s.charAt(j));
                    }
                    else
                    break;
            }
            if(max<num)
            max=num;
        }   
        return max;
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        System.out.println(longest_substring.lengthOfLongestSubstring(a));
    }
}