package org;

public class Countthealphabetsanddigitsinastring {
	public static void main(String []args)
	{
		String s="Jsp1236";
		int Alphacount=0;
		int digitcount=0;
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch=s.charAt(i);
			if( ch>='A' && ch<='Z' || ch>='a'&& ch<='z')
			{
				Alphacount++;
			}
			else if(ch>='1' && ch<='9')
			{
				digitcount++;
		
			}
		}
		System.out.println("Alpha count"+Alphacount);
		System.out.println("Digit count"+digitcount);
		
	}

}
