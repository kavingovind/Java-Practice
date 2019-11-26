/*--Program to print the factors of a number--*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class factorsofnumber
{
	public static void main(String args[])
	{
		Scanner ip = new Scanner(System.in);
		int i;
    int number=ip.nextInt();
    for(i=1; i <= number/2; i++)
		{
      if(number%i==0)  				
			{
	      System.out.print(i+" ");
			}
    }
		System.out.println();
  }
}
