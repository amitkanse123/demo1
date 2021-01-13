import java.util.Arrays;

public class array {
	public static void main(String[] args) {
		int a[] = { 2, 4, 7, 9, 12, 13 };
		int a1[] = { 9, 12, 13, 7, 4, 2 };

		for (int i = 2; i <= a.length - 1; i++) {
			if (a[i] % 2 != 0) {
				System.out.println("prime no" + a[i]);
			}

		}
		/*check(a, a1);
		if (true) {
			System.out.println("same");
		} else
			System.out.println("not same");
			*/
		    
		
	
	for(int i:a)
	{
		
	}
}
}
	/*private static boolean check(int[] a, int[] a1) {
		if (a.length == a1.length) {
			Arrays.sort(a);
			Arrays.sort(a1);
			for (int i = 0; i < a.length; i++) {
				if (a[i] != a1[i]) {
					return false;
				}
			}

		}
		return true;
	}*/

