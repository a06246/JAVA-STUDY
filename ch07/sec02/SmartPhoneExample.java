package ch07.sec02;

public class SmartPhoneExample {

	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("iphone", "silver");
		
		System.out.println("model: "+myPhone.model);
		System.out.println("color: "+myPhone.color);
		
		System.out.println("wifi: "+myPhone.wifi);
		
		myPhone.bell();
		myPhone.sendVoice("hello");
		myPhone.receiveVoice("heeloo");
		myPhone.hangUp();
		
		myPhone.setWifi(true);
		myPhone.internet();
		
	}

}
