// You don't need to add/edit anything to the below solution. 
// Click on the SUBMIT button to solve your first problem on CodeChef.

import java.lang.*;
import java.util.*;
import java.io.*;

// Remember that the class name should be "Main" and should be "public".

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
	public static void main(String args[])throws java.lang.Exception
		{
		FastReader sc = new FastReader();
		int t = sc.nextInt();
		// Read the number of test casese.
		
		while(t-- > 0)
			{
			int X = sc.nextInt();
			int Y = sc.nextInt();
			int ans = Y * 30;
			if (ans<=X)
				{
				System.out.println("YES");
				}
			else
				{
				System.out.println("NO");
				}
			}
		}
	}
