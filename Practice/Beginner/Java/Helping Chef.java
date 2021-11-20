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
		while(t-->0)
			{
			int N = sc.nextInt();
			if(N<10)
				{
				System.out.println("Thanks for helping Chef!");
				}
			else
				{
				System.out.println("-1");
				}
			}
		}
	}
	//written by Sambit Rout
