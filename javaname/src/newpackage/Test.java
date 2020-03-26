package newpackage;

public class Test {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,2,2};
		int count=1;
		int i;
		
		for(i=0;i<a.length;i++)
		{
			
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					break;
					
				}
				
			}
		
		

	}
		System.out.println(count);
}
}



	


