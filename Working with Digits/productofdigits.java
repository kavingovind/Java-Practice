/*-- Java Program to calculate product of digits--*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class productofdigits
{
	public static void main(String args[])
	{
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter the number ");
    int num=ip.nextInt();
		int n=num;
		int product=1;
		while(num!=0) //num should be greater than 0
		{
	    int rem=num%10;  
			product*=rem;
			num=num/10; 
		}
		System.out.println("Product of digits "+n+" is "+product);
  }
}
