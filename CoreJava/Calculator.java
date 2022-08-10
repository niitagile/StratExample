package BasicConcepts;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		int num1=0, num2=0, ans;// declaration of variables
		// Taking value from user
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("Enter 1 Add 2 Sub 3. Mult 4 Division 0 exit");
			int choice = scan.nextInt();
			if (choice != 0) {
				System.out.println("Enter I value");
				num1 = scan.nextInt();// initialization
				System.out.println("Enter II value");
				num2 = scan.nextInt();
			}
			switch (choice) {
			case 1:
				ans = num1 + num2;
				System.out.println("sum=" + ans);
				break;
			case 2:
				ans = num1 - num2;
				System.out.println("diff=" + ans);
				break;
			case 3:
				ans = num1 * num2;
				System.out.println("product=" + ans);
				break;
			case 4:
				if (num2 != 0) {
					ans = num1 / num2;
					System.out.println("q=" + ans);
				} else
					System.out.println("division by zero is not possible");
				break;
			case 0:
				System.exit(0);
			default:
				System.out.println("Wrong choice");
			}
			System.out.println();
		}
	}
}
