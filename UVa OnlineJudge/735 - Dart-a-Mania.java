import java.io.*;
import java.util.*;

class Main
{
	public static void main (String[] args) 
	{
		Scanner ip=new Scanner(System.in);
		int n=ip.nextInt();
		int arr[]=new int[62];
		arr[61]=50;
		for(int i=1;i<=20;i++)
		{
       arr[i]=i;
       arr[i*2]=i*2;
       arr[i*3]=i*3;
		}
		int brr[]=new int[62];
		int b=1;
		for(int i=1;i<62;i++)
		{
			if(arr[i]!=0)
      {
        brr[b++]=arr[i];
      }
    }
		while(n>0)
		{
		    int permutations=0;
		    int combinations=0;
            
        	    for(int i=0;i<b;i++)
        	    {
        	        for(int j=0;j<b;j++)
        	        {
        	            for(int k=0;k<b;k++)
        	            {
        	                if(brr[i]+brr[j]+brr[k]==n)
        	                {
        	                    permutations++;
        	                }
        	            }
        	        }
        	    }
        	    for(int i=0;i<b;i++)
        	    {
        	        for(int j=i;j<b;j++)
        	        {
        	            for(int k=j;k<b;k++)
        	            {
        	                if(brr[i]+brr[j]+brr[k]==n)
        	                {
        	                    combinations++;
        	                }
        	            }
        	        }
        	    }
        	    if(comb==0 || permu==0)
        	    {
        	        System.out.println("THE SCORE OF "+n+" CANNOT BE MADE WITH THREE DARTS.");
        	    }
        	    else
        	    {
        		    System.out.println("NUMBER OF COMBINATIONS THAT SCORES "+n+" IS "+comb+".");
        		    System.out.println("NUMBER OF PERMUTATIONS THAT SCORES "+n+" IS "+permu+".");
        	    }
        	    
        	    System.out.println("**********************************************************************");
              n=ip.nextInt();
		}
		System.out.println("END OF OUTPUT");
	}
}
