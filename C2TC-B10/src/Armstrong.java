import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int a=sc.nextInt();
		int sum=0, t=a;
		do {
			int d=a%10;
			sum=sum+d*d*d;
			a=a/10;
		}
		while(a!=0);
		if(sum==t)
			System.out.println("This number is armstrong");
		else
			System.out.println("This number is not armstrong");
		}
	}
