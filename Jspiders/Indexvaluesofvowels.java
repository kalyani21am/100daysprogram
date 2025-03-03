package org;

public class Indexvaluesofvowels { 
	public static void main(String []args)
	{
		String s="I am a developer";
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch=s.charAt(i);
			if(ch=='A'|| ch=='E' ||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				System.out.println(i);
			}
		}
	}
}
