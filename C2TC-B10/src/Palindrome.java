import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int a=sc.nextInt();
	int x=0,t=a;
	do {
		int d=a%10;
		x=x*10+d;
		a=a/10;
		}
	while(a!=0);
		if(x==t)
			System.out.println("It is palindrome"+x);
		else
			System.out.println("It is not palindrome");
		}

	}
