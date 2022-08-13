package methods;

public class MethodExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(UpperString("Anil"));//it prints "ANIL" on screen
		String ans=UpperString("Anil");
		System.out.println("Upper Case="+ans);
		int sum = calculation(UpperString("Anil"), 78,89,67);
		System.out.println("Total="+sum);	
		
	}

	private static String UpperString(String name) {
		
		return name.toUpperCase();
	}

	public static int calculation(String name, int mark1, int mark2, int mark3) {
		// TODO Auto-generated method stub
		System.out.println(name);
		return mark1+mark2+mark3;
	}

}
