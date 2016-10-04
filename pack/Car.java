package pack;

public class Car {
	private boolean isDriving;
	private boolean engineOn;
	private boolean isLocked;
	private boolean hasKey;
	
	public void startCar() {
		if(hasKey && !isLocked) {
			engineOn = true;
		}else{
			System.out.println("You do not have a key");
		}
	}
	
	public void pickupKey(boolean hasKey) {
		this.hasKey = hasKey;
	}
	
	public void unlock() {
		
	}
}
