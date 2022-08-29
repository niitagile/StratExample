package LambdaExamples;
@FunctionalInterface
interface message{
	void display(String msg);
}

/*class Test2 implements  message{

	@Override
	public void display(String msg) {
		System.out.println(msg);
		
	}
	
}*/
public class LambdaDemoExample {

	public static void main(String[] args) {
		
		//message obj=(msg)->	System.out.println(msg);
			
		message obj= msg-> System.out.println(msg);
			
			obj.display("Hello All!!!");
	}

}
