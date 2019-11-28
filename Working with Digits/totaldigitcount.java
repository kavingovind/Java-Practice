/*--Program to Count the digits in the given number--*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class totaldigitcount
{
	public static void main(String args[])
	{
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter the number ");
    int num=ip.nextInt();
		int n=num;
		int count=0;
		while(num>0) //num should be greater than 0
		{  
			num=num/10;
			count++;  
		}
		System.out.println("Total No of digits in "+n+" is "+count);
  }
}
