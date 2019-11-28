/*-- Java Program to draw Pyramid Pattern like below--*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class pyramidpatternlikebelow
{
	public static void main(String args[])
	{
		Scanner ip = new Scanner(System.in);
		int i,j,k,step=1;
		System.out.print("Enter the number ");
    int n=ip.nextInt();
		for(i=1;i<=2*n-1;i++) //rows
		{
			for(j=0;j<Math.abs(n-i);j++)	//spaces
			{
				System.out.print(" ");
			}
			for(k=0;k<step;k++)  //stars
			{
				System.out.print("*");
			}
			if(i<n)
			{
				step=step+1;
			}
			else
			{
				step=step-1;
			}
			System.out.println();
		}
  }
}

