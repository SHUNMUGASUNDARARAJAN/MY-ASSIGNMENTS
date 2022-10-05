package week1day1;

public class Bike {
		
		public void applybrake() {
			System.out.println("suddenly apply brake for bike");
		}

		public void soundhorn() {
			System.out.println("press the horn switch for bike");
		}
		
		
		public static void main(String[] args) {
			
	         Car l=new Car();
	         l.applybrake();
	         l.soundhorn();
	 
	        
	        Bike h=new Bike();
	        h.applybrake();
	        h.soundhorn();

		}
		
}

