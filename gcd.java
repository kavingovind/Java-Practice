/*--Program to find GCD of given number--*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class gcd
{
	public static void main(String args[])
	{
		Scanner ip = new Scanner(System.in);
    int num1 = ip.nextInt();
		int num2 = ip.nextInt();
		int n = (num1 < num2)?num1:num2;
		for(int i=n; i>=1; i--)
		{
			if(num1%i==0 && num2%i==0)
			{
				System.out.println("GCD of "+num1+" and "+num2+" is "+i);
				break;
			}
		}
  }
}
