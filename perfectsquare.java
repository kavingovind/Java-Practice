/*--Program to check whether given Integer is Perfect Square or not--*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class perfectsquare
{
	public static void main(String args[])
	{
		Scanner ip = new Scanner(System.in);
    int number=ip.nextInt();
		double num=(double)number;
		double sqr=Math.sqrt(num);
		if(sqr-Math.floor(sqr)==0)
		{
			System.out.println(number+" is a perfect square");
		}
		else
		{
			System.out.println(number+" is not a perfect square");
		}
  }
}
