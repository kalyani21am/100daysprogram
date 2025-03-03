package org;

public class Alphabetanddigitusingamethod {
	public static void Alphacount(int alphacount)
	{
		String s="Jsp1236";
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch=s.charAt(i);
			if( ch>='A' && ch<='Z' || ch>='a'&& ch<='z')
			{
				alphacount++;
			}
		}
	}
	public static void Digitcount(int digitcount)
	{
		String s="Jsp1236";
		for(int i=0;i<=s.length()-1;i++)
		{
		  char ch=s.charAt(i);
		  if(ch>='1' && ch<='9')
		 {
			digitcount++;
	
		 }
		}
	}
		
		
		public static void main(String []args) 
		{
			int Alphacount=0;
			int digitcount=0;
			System.out.println("Alpha count"+Alphacount);
			System.out.println("Digit count"+digitcount);		
	}


}
