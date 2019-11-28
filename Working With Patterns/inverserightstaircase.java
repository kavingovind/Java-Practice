/*-- Java Program to draw Inverse Right Staircase Pattern--*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class inverserightstaircase
{
	public static void main(String args[])
	{
		Scanner ip = new Scanner(System.in);
		int i,j;
		System.out.print("Enter the number ");
    int n=ip.nextInt();
		for(i=0;i<n;i++)
		{
			for(j=n;j>i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
  }
}

