import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import javax.xml.crypto.Data;

public class run {

	public static void main(String[] args) 
	{
		String[] days = {"Monday","Tuesday","Wednesday","Thursday","Firday"
				,"Saturday","Sunday"};
		
		Scanner in = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();
		while(in.hasNext()){
				int k=in.nextInt();
				
				for(int i=0;i<k;i++)
				{
					int mm = in.nextInt();
					
					int dd = in.nextInt();
					System.out.println(mm);
					System.out.println(dd);
					Data date = new Date(2011, mm-1, dd);
					cal.setTime(date);
					int dow=cal.get(Calendar.DAY_OF_WEEK);
					
					System.out.println(dow);
					System.out.println(days[dow]);
				}
		}
	}
}