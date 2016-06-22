package p22801;
import java.util.Calendar;
import java.util.Scanner;

public class p22801 {

	public static void main(String[] args) 
	{
		String[] days = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Firday"
				,"Saturday"};
		
		Scanner in = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();
		while(in.hasNext()){
				int k=in.nextInt();
				
				for(int i=0;i<k;i++)
				{
					int mm = in.nextInt();
					
					int dd = in.nextInt();
					
					cal.set(2011, mm-1, dd);
					int dow=cal.get(Calendar.DAY_OF_WEEK);

					System.out.println(days[dow-1]);
				}
				in.close();
				System.exit(0);
		}
		
	}
}