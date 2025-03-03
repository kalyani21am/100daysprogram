package patterns;

import java.util.Scanner;

public class Pattern13 {
	public static void main(String []args)
	{
		Scanner scan=new Scanner(System.in);
		int rows=scan.nextInt();
		int starcount=1;
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=starcount;j++)
			{
				System.out.print(" * ");
			}
			System.out.println();
			starcount++;
		}
		
	}

}
