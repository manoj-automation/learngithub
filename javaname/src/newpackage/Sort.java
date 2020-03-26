package newpackage;

public class Sort {
	public static void main(String args[])
	{
		int a[] = {3,7,4,12,10,22,16};
		int temp=0;
		int n= a.length;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					temp = a[i];
					a[i]=a[j];
					
					
					
					
					
					
					a[j]=temp;
					
				}
				
			}
			
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		/*
		 * System.out.println(n); int second = a[n-2]; System.out.println(second);
		 */
		
	}

}
