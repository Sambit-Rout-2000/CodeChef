import java.util.*;
import java.lang.*;
import java.io.*;
public class Main
	{
	static class FastReader
		{
		BufferedReader br;
		StringTokenizer st;
		public FastReader()
			{
			br = new BufferedReader(new InputStreamReader(System.in));
			}
		String next()
			{
			while (st == null || !st.hasMoreElements())
				{
				try {
				st = new StringTokenizer(br.readLine());
				}catch (IOException e)
					{
					e.printStackTrace();
					}
				}
			return st.nextToken();
			} 
		int nextInt()
			{
			return Integer.parseInt(next());
			}
		long nextLong()
			{
			return Long.parseLong(next());
			}
				//written by Sambit Rout
		double nextDouble()
			{
			return Double.parseDouble(next());
			}
		String nextLine()
			{
			String str = "";
			try {
				str = br.readLine();
			}catch (IOException e)
				{
				e.printStackTrace();
				}
			return str;
			}
		}
	public static void main (String[] args) throws java.lang.Exception
		{
		FastReader sc = new FastReader();
		int t = sc.nextInt();
		int p1[] = new int[t];
		int p2[] = new int[t];
		int lead[] = new int[t];
		int lead1 = 0;
		int lead2 = 0;
		int winner=0,dif=0;;
		for(int i=0;i<t;i++)
			{
			p1[i] = sc.nextInt();
			p2[i] = sc.nextInt();
			lead1 = lead1 + p1[i];
			lead2 = lead2 + p2[i];
			if(lead1>=lead2){
		        lead[i] = lead1 - lead2;
		        if(lead[i]>dif)
		            {
		            dif=lead[i];
		            winner=1;
		            }
			}
		    else{
		        lead[i] = lead2 - lead1;
		        if(lead[i]>dif)
		            {
		            dif=lead[i];
		            winner=2;
		            }
		        }
			}
		    System.out.println(winner+" "+dif);
		}
	}
	//written by Sambit Rout
