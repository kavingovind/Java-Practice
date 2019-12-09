import java.util.*;
import java.io.*;
import java.lang.*;

class Main
{
	  public static void main (String[] args)
	  {
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            int f=sc.nextInt();
            if(f==0)
                break;
            int r=sc.nextInt();
            
            int front[]=new int[f];
            int rear[]=new int[r];
            double result[]=new double[r*f];
            
            for(int i=0;i<f;i++)
            {
                front[i]=sc.nextInt();
            }
            for(int i=0;i<r;i++)
            {
                rear[i]=sc.nextInt();
            }
                
            int k=0;
            for(int i=0;i<f;i++)
            {
                for(int j=0;j<r;j++)
                {
                    result[k]=rear[j]*1.0/front[i];
                    k++;
                }
            }
            Arrays.sort(result);
            double max=0;
            for(int i=0;i<result.length-1;i++)
            {
                max=Math.max(max,result[i+1]/result[i]);
            }
            System.out.printf("%.2f\n",max);
        }
	  }
}
