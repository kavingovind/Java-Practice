/*--Program to check whether the given digit is occurred in a Number--*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class digitoccurence
{
	public static void main(String args[])
	{
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter the number ");
    int num=ip.nextInt();
		System.out.print("Enter the digit ");
    int d=ip.nextInt();
		int n=num;
		int flag=0;
		while(num!=0) //num should be greater than 0
		{
	    int rem=num%10;  
			if(rem==d)
    	{
	      System.out.println(d+" is occured in "+n);
				flag=1;
			}
			num=num/10; 
		}
		if(flag==0)
		{
			System.out.println(d+" is not occured in "+n);
		}
  }
}
