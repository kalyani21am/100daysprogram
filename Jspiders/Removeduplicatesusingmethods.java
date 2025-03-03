package org;

public class Removeduplicatesusingmethods {

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
	public static void removeDuplicate(String s)
	{
		String s1="";
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch=s.charAt(i);
			if(s1.indexOf(ch)==1)
			{
				s1=s1+ch;
			}
		}
		System.out.println("Unique"+ s1);
	}
	public static void main(String []args)
	{
		String s="";
		if(isEmpty(s))
		{
			System.out.println("String is empty");
		}
		else
		{
			removeDuplicate(s);
		}
	}
	
}
