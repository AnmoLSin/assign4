class student
{
	void fun(int arr[])
	{
		for(int  i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j] < arr[i])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		
		
	}
}
public class D6 {

	public static void main(String[] args) {
		
		student obj =new student();
		
		int[] arr= {1,1,1,1,0,0,1,0};
		
		obj.fun(arr);
		
		
		
		
		
	}

}