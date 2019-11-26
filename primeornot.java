/*--Program to check the number is prime or not--*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class primeornot
{
	public static void main(String args[])
	{
		Scanner ip = new Scanner(System.in);
		int i;
    int flag=0;
    int number=ip.nextInt();
    for(i=2; i <= number/2; i++)
		{
      if(number%i==0)  				
			{
	      flag=1;
			}
    }
    if(flag==0)
    {
		  System.out.println(number+" is a prime");
    }
    else
    {
		  System.out.println(number+" is not a prime");
    }
  }
}
    
