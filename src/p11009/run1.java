import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class run1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			String line1 = scanner.next();
			String line2 = scanner.next();
			lineprocessing(line1,line2);
		}
	}

	private static void lineprocessing(String line1, String line2) {
		// TODO Auto-generated method stub
		boolean found = true;
		char line_1[] = line1.toCharArray();
		char line_2[] = line2.toCharArray();
		int pointer = 0;
		for(int i=0;i<line_1.length;i++)
		{
			for(int j=pointer;j<line_2.length;j++)
			{
				pointer++;
				if(line_1[i] == line_2[j])
				{
					found = true;
					pointer = j + 1;
					break;
				}
				found = false;
			}
			
		}
		if(found){
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}
