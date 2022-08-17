package staitckeyword;
class ClassB{
	ClassB(){
		System.out.println("Constructor");
	}
	{	
		System.out.println("Initializer Block");
	}
	static{
		System.out.println("static block");
	}
}
public class block_example {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassB obj1=new ClassB();
		ClassB obj2=new ClassB();

	}

}
