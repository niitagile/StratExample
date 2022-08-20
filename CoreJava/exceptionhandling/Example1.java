package exceptionhandling;

public class Example1 {

	public static void main(String[] args) {
		
			try{
			System.out.println(5/0);
			
			System.out.println("Try block");
			}
			catch(ArithmeticException e){
				e.printStackTrace();
			}
			System.out.println("Hello All!!!");
	}

}
