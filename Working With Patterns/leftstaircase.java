/*-- Java Program to draw Left Staircase Pattern--*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class leftstaircase
{
	public static void main(String args[])
	{
		Scanner ip = new Scanner(System.in);
		int i,j,k;
		System.out.print("Enter the number ");
    int n=ip.nextInt();
		for(i=0;i<n;i++)    //To print rows
 		{
      for(k=n-i-1;k>0;k--)    //To print Spaces
      {
        System.out.print(" ");
      }
			for(j=0;j<=i;j++)   //To print '*'
			{
				System.out.print("*");
			}
			System.out.println();
		}
  }
}

