package newpackage;

public class Max {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		int a[] = {9,8,3,4,6};
		int count=1;
		int i;
		int first=a[0];
		int max=0;
		for(i=0;i<a.length;i++)
		{
			if(a[i]>first)
				{
				  max=a[i];
				  first=a[i];
				}
			else
			{
				max=first;
			}
		}
		System.out.println(max);
		
	
		
		
	}

}
