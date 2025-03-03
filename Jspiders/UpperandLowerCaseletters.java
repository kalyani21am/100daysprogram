package org;

public class UpperandLowerCaseletters {
	public static void main(String []args)
	{
		String s="InDia";
		String s1=" ";
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch=s.charAt(i);
			if(Character.isAlphabetic(ch))
			{
				if(Character.isLowerCase(ch))
				{
					s1=s1+Character.toUpperCase(ch);
				}
				else
				{
					s1=s1+Character.toLowerCase(ch);
				}
			}
		}
		System.out.print(s1);
	}

}
