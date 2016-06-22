package p10404;
import java.util.Scanner;

public class p10404 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			String str1 = in.next();
			String str2 = in.next();
			if(Integer.parseInt(str1)==0&&Integer.parseInt(str2)==0)
			{
				System.exit(0);
			}
			int count=0;
			int carry=0;
			int MAX = str1.length()>str2.length()?str1.length():str2.length();
			str1 = str(str1,MAX);
			str2 = str(str2,MAX);
			for(int i =MAX-1;i>=0;--i)
			{
				if((str1.charAt(i)-'0')+(str2.charAt(i)-'0')+carry>9)
				{
					count++;
					carry=1;
				}
				else
				{
					carry=0;
				}
			}
			if(count ==0)
				System.out.printf("No carry operation.\n");
			else if(count==1)
				System.out.printf("%d carry operation.\n",count);
			else
				System.out.printf("%d carry operations.\n",count);

		}
		in.close();
		System.exit(0);
	}
	static public String str(String str,int max)
	{
		for(int i=str.length();i<max;++i)
		{
			str = "0"+str;
		}
		return str;
	}
}
