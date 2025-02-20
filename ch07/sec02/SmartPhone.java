package ch07.sec02;

public class SmartPhone extends Phone {
	// phone 클래스 상속 받음 
	
	public boolean wifi;
	
	public SmartPhone(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("wifi status change");
	}
	
	public void internet() {
		System.out.println("internet connected");
	}

}
