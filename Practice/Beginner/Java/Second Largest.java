import java.lang.*;
import java.util.*;
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
	public static void main(String args[])throws java.lang.Exception
		{
		FastReader sc = new FastReader();
		int t = sc.nextInt();
		while(t-->0)
			{
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = sc.nextInt();
			int arr[]=new int[3];
			arr[0] = A;
			arr[1] = B;
			arr[2] = C;
			Arrays.sort(arr);
			System.out.println(arr[1]);
			}
		}
	}
