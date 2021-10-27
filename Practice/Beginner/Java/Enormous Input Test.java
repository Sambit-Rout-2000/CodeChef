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
		int A = sc.nextInt();
		int B = sc.nextInt();
		int count = 0;
		for(int i=0;i<A;i++)
			{
			int C = sc.nextInt();
			if(C%B==0)
				count++;
			}
		System.out.println(count);
		}
	}
