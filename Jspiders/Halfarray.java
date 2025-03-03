package doc;

public class Halfarray {
	public static void main(String []args)
	{
		int a[]= {1,2,3,4,5,6,7};
		for(int i=0;i<=a.length/2-1;i++)
		{
			System.out.println(a[i]+" * "+ i + " = "+ a[i]*i);
		}
	}

}
