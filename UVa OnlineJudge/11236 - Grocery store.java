import java.util.*;
import java.io.*;
import java.lang.*;
import java.text.*;

class Main
{
	public static void main (String[] args)
	{
		PrintWriter pw=new PrintWriter(System.out);
		StringBuilder sb=new StringBuilder();
		for(int p1=1;p1*4<=2000;p1++)
		{
			for(int p2=p1;p2*3<=2000-p1;p2++)   
			{
				for(int p3=p2;p3*2<=2000-p1-p2;p3++)
				{
					int sum=p1+p2+p3;
					int product=p1*p2*p3;
					int c=1000000;
					if(product<=c)
						continue;
					int d=sum*c;
					int e=product-c;
					int p4=d/e;
					if(p3>p4 || p1+p2+p3+p4>2000 || (p1+p2+p3+p4)*1000000!=p1*p2*p3*p4)
						continue;
					DecimalFormat f=new DecimalFormat("0.00");
					sb.append(f.format(p1/100.0)+" "+f.format(p2/100.0)+" "+f.format(p3/100.0)+" "+f.format(p4/100.0)+"\n");
				}
			}
		}
		pw.print(sb.toString());
		pw.flush();
		pw.close();
	}
}
