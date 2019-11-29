import java.io.*;
import java.util.*;

public class pyramidchar2
{
    	public static void main(String[] args)
	{
        	Scanner ip=new Scanner(System.in);
        	int n=ip.nextInt();
        	int i,j,k,step=1;
        	for(i=1;i<=n;i++)
        	{
        	    int a=65;
        	    char Char=(char)a;
        	    for(j=1;j<=n-i;j++)
        	    {
        	        System.out.print(" ");
        	    }
        	    for(k=1;k<=step;k++)
        	    {
        	        System.out.print(Char);
        	        if(k<=step/2)
        	        {
        	            Char++;
        	        }
        	        else
        	        {
        	            Char--;
        	        }
        	    }
        	    step+=2;
        	    System.out.println();
        	}
	}	
}
