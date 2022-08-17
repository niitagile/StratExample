package inheritence;

class Parent {
	Parent() {
		System.out.println("Parent constructor");
	}

	Parent(int a) {

		System.out.println("Parent class constructor"+a);
	}
}

class Child extends Parent {
	Child() {
		super(6);//call Parent's parameterized constructor. It must be ist line in block
		System.out.println("Child cosntructor");
	}
	
}

public class ParentConstructorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child obj = new Child();

	}

}
