import java.util.Scanner;
import java.lang.Math;

class D
{
	int fun(int a)
	{
		
		double sum=0,rem;
		int b=a,r=0;
		int c=a;
		while(b>0)
		{
			
			b=b/10;
			r++;
			
		}
		while(c>0)
		{
			rem=c%10;
			sum=sum+Math.pow(rem,r);
			c=c/10;
		}
		
		if(sum==a)
			return 1;
		else
			return 0;
		
	
	}
	
}
public class D4 {

	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		D obj =new D();
		int a=input.nextInt();
		int ans=obj.fun(a);
		if(ans==1)
			System.out.println("Armstrong number");
		if(ans==0)
			System.out.println("not a armstrong number");
		
		
		
		
		
	}

}