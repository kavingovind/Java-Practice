/*--Program to Print the Perfect squares between two intervals--*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class perfectsquareoftwonos
{
	public static void main(String args[])
	{
		Scanner ip = new Scanner(System.in);
		int start=ip.nextInt();
		int end=ip.nextInt();
		for(int number=start; number<=end ;number++)
		{
			double num=(double)number;
			double sqr=Math.sqrt(num);
			if(sqr-Math.floor(sqr)==0)
			{
				System.out.print(number+" ");
			}	
		}
		System.out.println();
  }
}

