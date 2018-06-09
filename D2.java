import java.util.Scanner;
class B
{
	void fun(int ans)
	{
		for(int i=0;i<=ans;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
		
	}
}
public class D2 {

	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		System.out.println("Enter a number");
		B obj =new B();
		int even=input.nextInt();
		obj.fun(even);
		
		
		
		
		
		
	}

}