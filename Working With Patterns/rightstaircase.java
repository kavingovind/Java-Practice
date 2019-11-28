/*-- Java Program to draw Right Staircase Pattern--*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class rightstaircase
{
	public static void main(String args[])
	{
		Scanner ip = new Scanner(System.in);
		int i,j;
		System.out.print("Enter the number ");
    int n=ip.nextInt();
		for(i=0;i<n;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
  }
}

