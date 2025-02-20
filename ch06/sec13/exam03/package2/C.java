package ch06.sec13.exam03.package2;

import ch06.sec13.exam03.package1.*;

public class C {
	public C() { 		// 이건 뭐임??
		A a = new A();
	
		a.field1 = 1;	// o
		a.field2 = 1;	// x
		a.field3 = 1;	// x
		
		a.method1();	// o
		a.method2();	// x
		a.method3();	// x
	}
}
