package p201501MN;

import java.util.Scanner;

public class p201501MN {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		long lines,items;
		lines = in.nextLong();
		items = in.nextLong();
		long tmp[] = new long[(int)lines];
		long c;
		c = items;
		for(int k=0;k<lines;k++)
		{
			for(int l=0;l<c;l++)
			{
				tmp[k]+=in.nextLong();
			}
			c-=1;
			if(k>0)
			{
				System.out.println(tmp[k-1]-tmp[k]);
			}
		}
	System.exit(0);	
	}

}
