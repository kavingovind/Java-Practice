/*--Program to count the occurence of digit--*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class digitcount
{
	public static void main(String args[])
	{
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter the number ");
    int num=ip.nextInt();
		System.out.print("Enter the digit ");
    int d=ip.nextInt();
		int n=num;
		int count=0;
		while(num!=0) //num should be greater than 0
		{
	    int rem=num%10;  
			if(rem==d)
    	{
				count++;
			}
			num=num/10; 
		}
		if(count!=0)
		{
			System.out.println(d+" is occured in "+n+" for "+count+" times.");
		}
		else
		{
			System.out.println(d+" is not occured in "+n);
		}
  }
}
