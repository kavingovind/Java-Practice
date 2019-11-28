/*--Program to check whether given Integer is Armstrong or Not--*/

//  count the digits
//  product of each digits(upto count value)
//  add the products

import java.util.*;
import java.lang.*;
import java.io.*;

public class armstrongornot
{
	public static void main(String args[])
	{
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter the number ");
    int num=ip.nextInt();
		int n=num,count=0,rem,product,sum=0;
		while(num>0) //num should be greater than 0
		{  
			num=num/10;
			count++;  
		}
		num=n;
		while(n!=0)
		{
			rem=n%10;
			product=1;
			for(int i=1;i<=count;i++)
			{
				product*=rem;
			}
			sum+=product;
			n=n/10;
		}
		if(sum==num)
		{
			System.out.println(num+" is Armstrong number");
		}
		else
		{
			System.out.println(num+" is not Armstrong number");
		}
  }
}
