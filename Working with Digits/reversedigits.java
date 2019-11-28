/*--Program to reverse the digits of an number--*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class reversedigits
{
	public static void main(String args[])
	{
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter the number ");
    int num=ip.nextInt();
		int rem,rev=0;
		while(num!=0)
		{
	    rem=num%10;
			rev=rev*10+rem;
			num=num/10; 
		}
    System.out.println(rev);
  }
}
