import java.util.Scanner;
class C
{
	void fun(int ans)
	{	int count1;
		 for(int i=1; i<=ans; i++)
		    {
		        count1=0;
		        for(int j=1; j<=ans; j++)
		        {
		            if(i%j==0)
		                count1++;
		        }
		        if(count1==2)
		           System.out.println(i);
		    }
		
		
	}
	
}
public class D3 {

	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		System.out.println("Enter a number");
		C obj =new C();
		int ans=input.nextInt();
		obj.fun(ans);
		
		
		
		
		
		
	}

}