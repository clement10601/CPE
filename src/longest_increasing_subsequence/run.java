package longest_increasing_subsequence;

import java.util.Scanner;

public class run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int items[] = new int[n];
		for(int i = 0; i < n; i++)
		{
			items[i] = scanner.nextInt();	
		}
		int LIS[] = new int[n];
		
		for(int i=0;i<n;i++) //1~7
		{
			LIS[i] = 1;
			for(int j = i-1; j >= 0;j--)
			{
				 if ((LIS[j]+1 > LIS[i]) &&(items[i]>items[j]))
				 {
					 LIS[i]=LIS[j]+1;
				 }
			}
		}
		int tmp = 0;
		for (int i : LIS) {
			if(i > tmp)
			{
				tmp = i;
			}
		}
		System.out.println(tmp);
	}

}
