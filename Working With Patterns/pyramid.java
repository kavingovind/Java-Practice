/*-- Java Program to draw Pyramid Pattern--*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class pyramid
{
	public static void main(String args[])
	{
		Scanner ip = new Scanner(System.in);
		int i,j,k;
		System.out.print("Enter the number ");
    		int n=ip.nextInt();
		for(i=0;i<n;i++)
		{
			for(k=n-i-1;k>0;k--)
      			{
        			System.out.print(" ");
      			}
			for(j=0;j<=2*i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
  	}
}
