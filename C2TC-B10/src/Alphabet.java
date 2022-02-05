import java.util.Scanner;
public class Alphabet {

	public static void main(String[] args) {
		String temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string values");
		int n=sc.nextInt();
		String names[]=new String[n];
		System.out.println("Enter all the names");
		for (int i=0;i<n;i++)
		{
		names[i]=sc.nextLine();	
		}
		for (int i=0;i<n;i++)
		{
			for (int j=i;j<n;j++)
			{
				if (names[i].compareTo(names[j])>0)
				{
					temp=names[i];
					names[i]=names[j];
					names[j]=temp;					
				}
			}
		}
		System.out.println("Names in sorted order:");
		for (int i=0;i<n-1;i++)
		{
			System.out.println(names[i]+" ");
		}
		System.out.println(names[n-1]);
	}
}
		
		
		
	