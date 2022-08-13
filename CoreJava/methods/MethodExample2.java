package methods;

import java.util.Scanner;

public class MethodExample2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 values");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int greater=MethodExample2.max(num1,num2);
		System.out.println("greater value::"+greater);
		float sum=MethodExample3.total(num1, num2, 6.7f);
		System.out.println("total::"+sum);
	}
	
	public static int max(int num1, int num2) {
		int large;
		if(num1>num2)
			large=num1;
		else
			large=num2;
		return large;
	}

}
