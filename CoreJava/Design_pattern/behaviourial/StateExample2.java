package Design_pattern.behaviourial;
 interface PackageState {

    void next(Package pkg);
    void prev(Package pkg);
    void printStatus();
}
 
 class OrderedState implements PackageState {

	    @Override
	    public void next(Package pkg) {
	        pkg.setState(new DeliveredState());
	    }

	    @Override
	    public void prev(Package pkg) {
	        System.out.println("The package is in its root state.");
	    }

	    @Override
	    public void printStatus() {
	        System.out.println("Package ordered, not delivered to the office yet.");
	    }
	}
class DeliveredState implements PackageState {
			
	    @Override
	    public void next(Package pkg) {
	        pkg.setState(new ReceivedState());
	    }

	    @Override
	    public void prev(Package pkg) {
	        pkg.setState(new OrderedState());
	    }

	    @Override
	    public void printStatus() {
	        System.out.println("Package delivered to post office, not received yet.");
	    }
	}
 class ReceivedState implements PackageState {

    @Override
    public void next(Package pkg) {
        System.out.println("This package is already received by a client.");
    }

    @Override
    public void prev(Package pkg) {
        pkg.setState(new DeliveredState());
    }

	@Override
	public void printStatus() {
		// TODO Auto-generated method stub
		
	}
}
class Package {

    private PackageState state = new OrderedState();

    // getter, setter

    public void previousState() {
        state.prev(this);
    }

    public void nextState() {
        state.next(this);
    }

    public void printStatus() {
        state.printStatus();
    }

	public PackageState getState() {
		return state;
	}

	public void setState(PackageState state) {
		this.state = state;
	}
    
}


public class StateExample2 {

	public static void main(String[] args) {
		Package pkg = new Package();
        pkg.printStatus();

        pkg.nextState();
        pkg.printStatus();

        pkg.nextState();
        pkg.printStatus();

        pkg.nextState();
        pkg.printStatus();
	}

}
