 package doc;

public class SmallestElement {
            public static boolean isEmpty(int []a)
            {
            	if(a.length==0)
            	{
            		return true;
            	}
            	else
            	{
            		return false;
            	}
            }
            public static boolean isNegative(int []a)
            {
            	for(int i=0;i<=a.length-1;i++)
            	{
            		if(a[i]<0) { 
            			return true;
            		}
            	}
            	return false;
            }
            public static void smallest(int []a)
            {
            	int smallest=a[0];
            	for(int i=0;i<=a.length-1;i++)
            	{
            		if(a[i]<smallest)
            		{
            			smallest=a[i];
            		}
            	}
            System.out.println("Smallest: "+smallest);
            }
public static void main(String []args)
{
	int []a= {2,3,4,5,6};
	if(isEmpty(a))
	{
		System.out.println("Array is empty");
	}
	else
	{
		if(isNegative(a)) {
			System.out.println("Array contains negative element");
		}
		else {
			smallest(a);
		}
			
		}
	}
	
}
