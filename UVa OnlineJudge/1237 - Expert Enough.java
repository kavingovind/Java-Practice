import java.util.*;
import java.io.*;
import java.lang.*;

class Main
{
	public static void main(String args[])
	{
		Scanner ip=new Scanner(System.in);
		int tc=ip.nextInt();
		for(int t=0;t<tc;t++)
		{
			int n=ip.nextInt();
			int low[]=new int[n];
			int high[]=new int[n];
			String maker[]=new String[n];
			for(int i=0;i<n;i++)
			{
				maker[i]=ip.next();
				low[i]=ip.nextInt();
				high[i]=ip.nextInt();
			}
			int q=ip.nextInt();
			int query[]=new int[q];
			for(int i=0;i<q;i++)
			{
				query[i]=ip.nextInt();
			}
			for(int i=0;i<q;i++)
			{
				int count=0;
				String out="";
				for(int j=0;j<n;j++)
				{
					if(query[i]>=low[j] && query[i]<=high[j])
					{
						count++;
						out=maker[j];
					}
				}	
				if(count==1)
				{
					System.out.println(out);
				}		
				else
				{
					System.out.println("UNDETERMINED");
				}			
			}
			if(t!=tc-1)
			{
					System.out.println();
			}
		}
	}
}
