import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int a=sc.nextInt();
	int j=2;
	while(j<=a/2)
	{
		if(a%j==0)
		{
			System.out.println("It is not a prime number");
		return;
		}
		j++;
	}
		System.out.println("It is prime number");
}
}
