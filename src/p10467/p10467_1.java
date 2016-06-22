/**
 * 
 */
import java.awt.GridBagConstraints;
import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;
import javax.security.auth.x500.X500Principal;
/**
 * @author pcuser
 *
 */
public class p10467 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter;
		Scanner scanner = new Scanner(System.in);
		counter = scanner.nextInt();
		
		for(int i =0;i<counter;i++)
		{
			int m = scanner.nextInt();
			int n = scanner.nextInt();
			
			int result = calculate(m,n);
			System.out.println(result);
		}

	}
	static int calculate(int m,int n)
	{
		int x = n/3;
		int y = m/3;
		int sonars = x*y;
		return sonars;
	}
	

}
