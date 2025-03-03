package doc;

public class Primeelementsinanarray {

	public static void main(String []args) {
		int a[]= {1,2,3,4,5,6,7};
		int count=0;
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=2;i<=a.length-1;j++)
			{
				if(a[i]%2==0)
				{
					count++;
					break;
				}
			}
			if(count==0)
			{
				System.out.println(count);
			}
		}
	}
}
