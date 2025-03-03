package org;

public class Evenindexcharacters {
	public static void main(String []args)
	{
		String s="IndiA";
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch=s.charAt(i);
			if(i%2==0 && i!=0)
			{
				System.out.println(ch);
			}
		}
	}
  
}
