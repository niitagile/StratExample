package Abstraction;
abstract class Microwave{
	private int temp;
	private int time;
	abstract void setTemp();
	abstract void setTime();
	void power(){
		System.out.println("on/off");
	}
}
class Cake extends Microwave{

	@Override
	void setTemp() {
		// TODO Auto-generated method stub
		System.out.println("Temp is 180 degree");
	}

	@Override
	void setTime() {
		// TODO Auto-generated method stub
		System.out.println("Timing is 45 min");
	}

	
	
		
}

class Sandwitch extends Microwave{

	@Override
	void setTemp() {
		// TODO Auto-generated method stub
		System.out.println("Temp is 50 degree");
		
	}

	@Override
	void setTime() {
		// TODO Auto-generated method stub
		System.out.println("Time is 10 min");
	}
	
}
public class AbstractClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Microwave obj=new Microwave();
		Microwave obj=new Cake();
		obj.setTime();
		
		Microwave obj1=new Sandwitch();
		obj1.setTime();
		
	}

}
