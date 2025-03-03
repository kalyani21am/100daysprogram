package patterns;

import java.util.Scanner;

public class Pattern14 {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int rows=sc.nextInt();
		int spacecount=(rows-1);
		int starcount=1;
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=spacecount;j++)
			{
				System.out.print("   ");
			}
			for(int a=1;a<=starcount;a++)
			{
				System.out.print(" * ");
			}
			spacecount--;
			starcount++;
			System.out.println();
		}
		
	}

}
