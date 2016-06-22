package p23551;
import java.util.Scanner;

public class p23551 {

	public static void main(final String[] args) {

		final Scanner sc = new Scanner(System.in);

		final int count = Integer.parseInt(sc.nextLine());

		for (int k = 0; k < count; k++) 
		{
			final int row = sc.nextInt();
			final int col = sc.nextInt();
			final int num = sc.nextInt();

			sc.nextLine();
			System.out.println(row + " " + col + " " + num);

			if(row==0 || col==0 || num==0)
			{
				continue;
			}
			
			final char matrix[][] = new char[row][col];
			for (int i = 0; i < row; i++) 
			{
				final String s2 = sc.nextLine();
				for (int j = 0; j < col; j++)
					matrix[i][j] = s2.charAt(j);
			}

			for (int n = 0; n < num; n++) 
			{
				int size = 1, constant = 1;
				boolean check = true;
				
				final int specify_x = sc.nextInt();
				final int specify_y = sc.nextInt();

				if(specify_x>row-1 || specify_y>col-1)
				{
					System.out.println(0);
					continue;
				}

				final char chr = matrix[specify_x][specify_y];
				while (check) 
				{
					for (int i = specify_x - constant; i <=specify_x + constant; i++)
					{
						for (int j = specify_y - constant; j <= specify_y+ constant; j++)
						{
							if (i < 0 || j < 0 || i >= row || j >= col) 
							{
								check = false;
								break;
							}
							if (matrix[i][j] != chr) 
							{
								check = false;
								break;
							}
						}
					}
					if (check) 
					{
						size += 2;
						constant++;
					}
				}
				System.out.println(size);
			}
		}
		sc.close();
	}
}