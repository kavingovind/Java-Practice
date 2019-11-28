/*-- Java Program to draw Inverse Left Staircase Pattern--*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class inverseleftstaircase
{
	public static void main(String args[])
	{
		Scanner ip = new Scanner(System.in);
		int i,j,k;
		System.out.print("Enter the number ");
    int n=ip.nextInt();
		for(i=0;i<n;i++)    //To print rows
 		{
      for(k=0;k<i;k++)    //To print Spaces
      {
        System.out.print(" ");
      }
			for(j=n;j>i;j--)   //To print '*'
			{
				System.out.print("*");
			}
			System.out.println();
		}
  }
}

