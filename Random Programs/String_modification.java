//accept a string that terminates at eather "." or "?" or "!" and check the word
//starting with consonants and print them in descending order and the remaining 
//words in reverse form.
import java.util.*;
public class String_modification {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter string");
        String str = in.nextLine();
        str=str.toUpperCase();
        if(str.charAt(str.length()-1)=='.' || str.charAt(str.length()-1)=='?' ||str.charAt(str.length()-1)=='!')
        {
            str=str.substring(0,str.length()-1);
            String[] st = str.split(" ");
            for (String st1 : st) {
                if (st1.charAt(0) == 'A' || st1.charAt(0) == 'E' || st1.charAt(0) == 'I' || st1.charAt(0) == 'O' || st1.charAt(0) == 'U') {
                    for (int j = st1.length() - 1; j>=0; j--) {
                        System.out.print(st1.charAt(j));
                    }
                    System.out.print(" ");
                } else {
                    for (int j = 90; j>=65; j--) {
                        if (st1.indexOf((char)j) != -1) {
                            System.out.print((char)j);
                        }
                    }
                    System.out.print(" ");
                }
            }
        }
        else
            System.out.println("Invalid String");
    }
}
