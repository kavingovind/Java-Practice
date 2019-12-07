import java.util.*;
import java.io.*;
import java.lang.*;

class Main
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
        String s;
        while((s=br.readLine())!=null)
        {
            StringBuilder sb=new StringBuilder();
            int k=Integer.parseInt(s);
            int count=0;
            for(double y=k+1; y<=2*k; y++)
            {
                double x=(k*y)/(y-k);
                if((int)(double)x==x)
                {
                    count++;
                    sb.append("1/");
                    sb.append(k);
                    sb.append(" = 1/");
                    sb.append((int)x);
                    sb.append(" + 1/");
                    sb.append((int)y);
                    sb.append("\n");
                }
            }
            System.out.println(count);
            System.out.print(sb);
        }
    }
}

