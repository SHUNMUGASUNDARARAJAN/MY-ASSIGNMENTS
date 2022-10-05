package week1day1;

public class Car {
	
	public void applybrake() {
		System.out.println("suddenly apply brake for car");
	}

	public void soundhorn() {
		System.out.println("press the horn switch for car");
	}
	
	public static void main(String[] args) {
		
        Car l=new Car();
        l.applybrake();
        l.soundhorn();
        
	}

}
