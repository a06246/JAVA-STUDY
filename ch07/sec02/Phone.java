package ch07.sec02;

public class Phone {
	public String model;
	public String color;
	
	public void bell() {
		System.out.println("bell on");
	}
	
	public void sendVoice(String message) {
		System.out.println("me: "+message);
	}
	
	public void receiveVoice(String message) {
		System.out.println("you: "+message);
	}
	
	public void hangUp() {
		System.out.println("bell off");
	}
}
