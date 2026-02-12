/*
Program: Factorial using recursion
Concept: Basic Recursion
Author: Fahim
Class: 11
*/
import java.util.*;
public class Factorial_recursion {

    static int factorial(int a)
    {
        if(a<=1)
            return 1;
        else 
            return a * factorial(a-1);
    }
    @SuppressWarnings("resource")
    public static void main(String args[])

{
    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    System.out.println(factorial(a));
    
}
    
}
