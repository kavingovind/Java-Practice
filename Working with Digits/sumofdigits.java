/*-- Java Program to calculate sum of digits--*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class sumofdigits
{
	public static void main(String args[])
	{
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter the number ");
    int num=ip.nextInt();
		int n=num;
		int sum=0;
		while(num!=0) //num should be greater than 0
		{
	    int rem=num%10;  
			sum+=rem;
			num=num/10; 
		}
		System.out.println("Sum of digits "+n+" is "+sum);
  }
}
