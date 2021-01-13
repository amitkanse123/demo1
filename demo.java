import java.util.Scanner;

public class demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		grade(sc);

	}

	private static void grade(Scanner sc) {
		System.out.println("enter marks");
		int a = sc.nextInt();

		if (a > 70) 
			System.out.println("distinication");
		 else if (a > 60 && a < 70)
			System.out.println("first class");
		else if (a > 50 && a < 60)
			System.out.println("second class");
		else if (a > 40 && a < 50)
			System.out.println("pass");
		else 
			System.out.println("fail");
		

	}
}
