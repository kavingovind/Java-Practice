import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;

class Main
{
	public static void main(String args[])
	{
		Scanner ip=new Scanner(System.in);
		for(int t=1;;t++)
		{
			int n=ip.nextInt();
			if(n==0)
				break;
			else
			{
				int a[]=new int[n];
				for(int i=0;i<n;i++)
					a[i]=ip.nextInt();
				int q=ip.nextInt();
				int x=0,y=0;
				System.out.println("Case "+t+":");
				while(q-- > 0)
				{
					int num=ip.nextInt();
					int sum=a[0]+a[1];
					for(int i=0;i<=n;i++)
					{
						for(int j=i+1;j<n;j++)
						{
							x=Math.abs(num-(a[i]+a[j]));
							y=Math.abs(num-sum);
							if(x<y)
								sum=a[i]+a[j];
							else
								sum=sum;
						}
					}
					System.out.println("Closest sum to "+ num + " is "+sum+".");
				}
			}
		}
	}
}
