package doc;

import java.util.Scanner;

public class Checkelement {
	public static String isCheck(int []a,int ele)
	{
		boolean isCheck=false;
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]==ele)
			{
				isCheck=true;
				return "Yes given element is present";
			}
		}
		if(isCheck==false) {
			return "Given element is not present";
		}
		return null;
		
	}
           public static void main(String[] args)
           {
        	   Scanner sc=new Scanner(System.in);
        	   int []a= {2,3,4,5,6};
        	   System.out.println("Enter the element to check");
        	   int ele=sc.nextInt();
        	   String res=isCheck(a,ele);
        	   System.out.println(res);
        	   
        	   
           }
}
