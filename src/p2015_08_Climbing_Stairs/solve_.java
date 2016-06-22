import java.util.Scanner;

public class solve_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		if(input<=0)
		{
			System.out.println("0\n");
			System.exit(0);
		}
		if(input==1)
		{
			System.out.println("1\n");
			System.exit(0);
		}
		
		double last = 1, lastlest = 1;
		double now = 0;
		
		for(int i=1;i<input;i++)
		{
			now = last + lastlest;
			last = lastlest;
			lastlest = now;
		}
		
		System.out.printf("%.0f\n",now);
                System.exit(0);

	}

}
