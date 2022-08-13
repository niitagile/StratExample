package methods;

public class MethodExample3 {

	public static void main(String[] args) {
		float tot=MethodExample3.total(4.5f,  6.7f,  8.9f);
		System.out.println("total::"+tot);
				
	}
	
	public static float total(float num1, float num2, float num3){
		float ans=num1+num2+num3;
		return ans;
	}

}
