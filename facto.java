import java.util.Scanner;

public class facto {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter no");
	int a=sc.nextInt();
	int fact=1;
	int fact1=1;
	
	for(int i=a;i>=1;i--)
	{
		fact=fact*i;
	}
	System.out.println("factorial "+fact);

	for(int i=1;i<=a;i++)
	{
		fact1=fact1*i;
	}
	System.out.println(fact);
}
}
