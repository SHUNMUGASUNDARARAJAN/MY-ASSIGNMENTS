package week1day1;

public class Mobile {
	
	public void sendSms(String text) {
		System.out.println(text);
	}

	public void takeSnapshot(String picture) {
		System.out.println(picture);
	}
	public static void main(String[] args) {
		Mobile s=new Mobile();
		s.sendSms("hi dear friend");
		s.takeSnapshot("take selfie");

	}

}
