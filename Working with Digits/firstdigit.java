/*-- Java Program to find the first digit of a number--*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class firstdigit
{
	public static void main(String args[])
	{
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter the number ");
    		int num=ip.nextInt();
		int n=num;
		while(num>=10) //num should be greater than 10
		{  
			num=num/10;  //divides num by 10
		}
		System.out.println("First digit of "+n+" is "+num);
  	}
}
