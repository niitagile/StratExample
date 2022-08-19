package Abstraction;
//in interface all members are public, methods abstarct, variables are final static
interface Project{
	int MAXTIME=10;
	void requirements();
	void analysis();
}
interface Testing{
	void testingtool();
}
/*interface Project{
	public static final int MAXTIME=10;
	public abstract void requirements();
	public abstract void analysis();
}
 * 
 */

class Website implements Project,Testing{

	@Override
	public void requirements() {
		// TODO Auto-generated method stub
		System.out.println("Website requirement");
	}

	@Override
	public void analysis() {
		// TODO Auto-generated method stub
	System.out.println("Website Analysis");	
	}

	@Override
	public void testingtool() {
		// TODO Auto-generated method stub
		System.out.println("Testing tool");
	}
	
}
public class interfaceexample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Website obj=new Website();
		obj.requirements();
		obj.analysis();
		obj.testingtool();
	}

}
