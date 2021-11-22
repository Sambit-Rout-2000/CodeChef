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
		int N = sc.nextInt();
		//int arr[] = new int[N];
		int even = 0;
		int odd = 0;
		for (int i=0;i<N;i++)
			{
			//arr[i] = sc.nextInt();
			int temp = sc.nextInt();
			if(temp%2==0)
				{
				even++;
				}
			else
				{
				odd++;
				}
			}
		if(even<=odd)
			{
			System.out.print("NOT READY");
			}
		else
			{
			System.out.print("READY FOR BATTLE");
			}
		}
	}
