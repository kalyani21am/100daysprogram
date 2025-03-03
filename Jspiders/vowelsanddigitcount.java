package org;

public class vowelsanddigitcount 
{
	public static boolean isEmpty(String s)
	{
		if(s.length()==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void count(String s)
	{
		int vowelcount=0;
		int digitcount=0;
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch=s.charAt(i);
			if(Character.isAlphabetic(ch))
			{
				if((ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') ||(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u'))
				{
					vowelcount++;
				}
			}
			else
			{
				digitcount++;
			}  
		}
		System.out.println("Vowelcount "+ vowelcount);
		System.out.println("digitcount "+digitcount);
	}
	public static void main(String []args)
	{
		String s="Java123";
		if(isEmpty(s))
		{
			System.out.println("String is empty");
		}
		else
		{
			count(s);
		}
	}

}
