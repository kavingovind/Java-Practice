/*--Program to check whether given Integer is perfect number or not--*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class perfectnumber
{
	public static void main(String args[])
	{
		Scanner ip = new Scanner(System.in);
		int i,sum=0;
    int number=ip.nextInt();
    for(i=1; i <= number/2; i++)
		{
      if(number%i==0)  				
			{
	      sum+=i;
			}
    }
		if(sum==number)
		{
			System.out.println(number+" is a perfect number");
		}
		else
		{
			System.out.println(number+" is not a perfect number");
		}
  }
}
