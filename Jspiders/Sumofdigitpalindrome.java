package org;

public class Sumofdigitpalindrome {
	public static void main(String []args)
	{
		String s="Js12345p";
		int num=0;
		int sum=0;
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch=s.charAt(i);
			if(Character.isDigit(ch))
			{
				num=num+ch;
			}
		}
		int sum1=0;
		int temp2=num;
		while(temp2!=0)
		{
			int ld=temp2%10;
			sum1=sum1+ld;
			temp2=temp2/10;
		}
		int temp=sum1;
		int rev=0;
		while(temp>0)
		{
			int ld=temp%10;
			rev=rev*10+ld;
			temp=temp/10;
		}
		if(sum1==rev)
		{
			System.out.println("Is palindrome");
		}
		else
		{
			System.out.println("Not a palindrome"); 
		}
	}

}
