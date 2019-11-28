/*--Program to check whether given Integer is Palindrome or Not--*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class palindromeornot
{
	public static void main(String args[])
	{
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter the number ");
    int num=ip.nextInt();
		int n=num;
		int rem,rev=0;
		while(num!=0)
		{
	    rem=num%10;
			rev=rev*10+rem;
			num=num/10; 
		}
		if(rev==n)
    {
			System.out.println(n+" is a Palindrome number");
		}
		else
		{
			System.out.println(n+" is not a Palindrome number");
		}
  }
}
