package org;

import java.util.Arrays;

public class Anagram {
	public static void anagram(String s1,String s2)
	{
		if(s1.length()==s2.length())
		{
			String str=s1.toLowerCase();
			String str1=s2.toLowerCase();
		char[] ch = s1.toCharArray();
		char[] ch1 = s2.toCharArray();
		/* Arrays.sort(ch);
		 * Arrays.sort(ch1);   predefined methods
		 */
		for (int i = 0; i <=ch.length - 1; i++)
        {
            for (int j = i+1; j < ch.length- 1; j++)
            {
                if (ch[i] > ch1[j])
                {
                    char temp = ch1[i];
                    ch1[i] = ch1[j];
                    ch1[j] = temp;
                    
                }
            }
        }
		for (int i = 0; i <=ch1.length - 1; i++)
        {
            for (int j = i+1; j < ch1.length- 1; j++)
            {
                if (ch[i] > ch1[j])
                {
                    char temp = ch1[i];
                    ch1[i] = ch1[j];
                    ch1[j] = temp;
                   
                }
            }
        }
		boolean res=Arrays.equals(ch, ch1);
		if(res==true)
		{
			System.out.println(" Anagram");
		}
		else
		{
			System.out.println("Not a anagram");
		} 
		}
		else
		{
			System.out.println("the given string is not a anagram");
		}
		
	}
	public static void main(String []args)
	{
		String s1="are";
		String s2="Race";
		anagram(s1,s1);
		
	}

}
