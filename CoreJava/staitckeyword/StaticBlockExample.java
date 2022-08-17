package staitckeyword;

public class StaticBlockExample {

	static {
		System.out.println("static Block");
	}
	{
		System.out.println("Initializer Block");
	}

	public StaticBlockExample() {
		System.out.println("Constructor Block");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticBlockExample st = new StaticBlockExample();

		StaticBlockExample st1 = new StaticBlockExample();
		

	}

}
