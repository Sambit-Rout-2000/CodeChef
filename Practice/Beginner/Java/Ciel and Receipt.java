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
		int arr = 11;
		while(t-->0)
			{
			int A = sc.nextInt();//12
			int count=0;
			for (int i = 11 ; i >= 0 ; i-- )
				{
				int num = (int)Math.pow(2,i);
				while(A>=num)
					{
					A-=num;
					count++;
					}
				}
			System.out.println(count);
			}
		}
	}
	//written by Sambit Rout
