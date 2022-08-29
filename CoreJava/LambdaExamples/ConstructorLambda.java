package LambdaExamples;

@FunctionalInterface
interface SayableC{
	void say();
}
@FunctionalInterface
interface Messanger{
	MethodRefC getMessage(String msg);
}

class MethodRefC{
	

	MethodRefC() {
		System.out.println("Default Constructor");

	}	

	MethodRefC(String str) {
		System.out.println(str);
	}
}
public class ConstructorLambda {

	public static void main(String[] args) {
		
		SayableC obj=MethodRefC::new;
		obj.say();
		
		Messanger obj1=MethodRefC::new;
		obj1.getMessage("Constructor");

	}
	

}

