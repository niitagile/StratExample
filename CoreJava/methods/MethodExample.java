package methods;
//a block of statement which is having name and take some pararmeter to perform some task
public class MethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				boolean status =MethodExample.accountDepartment(5000);
	
				System.out.println(status);
				 status =MethodExample.accountDepartment(-1233);
				
				System.out.println(status);
	}

	public static boolean accountDepartment(int i) {
		
		
		if (i >0)
		return true;
		else 
			return false;
	}

}
