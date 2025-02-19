package ch06.sec08.exam03;

public class Car {
	int gas;
	
	void setGas (int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if (gas == 0) {
			System.out.println("no gas");
			return false;
		}
		System.out.println("yes gas");
		return true;
	}
	
	void run() {
		while (true) {
			if (gas > 0) {
				System.out.println("run. (gas: "+gas+")");
				gas -= 1;
			} else {
				System.out.println("stop. (gas: "+gas+")");
				return;
			}
		}
	}
	
}
