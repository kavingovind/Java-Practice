import java.io.*;
import java.util.*;

public class diamondpattern2
{

    public static void main(String[] args) 
    {
        Scanner ip=new Scanner(System.in);
        int i,j,k,num,step=1;
	      System.out.print("Enter the size: ");
        int n=ip.nextInt();
        for(i=1;i<=2*n-1;i++)
        {
            num=1;
            if(i<n)
            {
                for(j=1;j<=n-i;j++)
                {
                    System.out.print(" ");
                }            
                for(k=1;k<=step;k++)
                {
                    System.out.print(num);
                    if(k<i)
                    {
                        num++;
                    }
                    else
                    {
                        num--;
                    }
                }
                step=step+2;
                System.out.println();
            }
            else
            {
                for(j=1;j<=i-n;j++)
                {
                    System.out.print(" ");
                }
                for(k=1;k<=step;k++)
                {
                    System.out.print(num);
                    if(k<(step-(step/2)))
                    {
                        num++;
                    }
                    else
                    {
                        num--;
                    }
                }
                step=step-2;
                System.out.println();
            }
        }
    }
}
