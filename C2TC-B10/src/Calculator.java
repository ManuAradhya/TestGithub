import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
System.out.println("enter the values");
int a=sc.nextInt();
int b=sc.nextInt();
System.out.println("Enter an operator '+,-,*,/':");
char operator=sc.next().charAt(0);
double output=0;
switch(operator)
{
case '+':
	output=a+b;
	break;
case '-':
	output=a-b;
	break;
case '*':
	output=a*b;
	break;
case '/':
	output=a/b;
	break;
	default:
		System.out.println("invalid");
}
System.out.println(a+" "+operator+" "+b+" = "+output);
}
	}
