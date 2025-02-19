package ch06.sec13.exam02.package2;

import ch06.sec13.exam02.package1.*;

public class C {
	A a1 = new A(true);		// 가능 
	A a2 = new A(1);		// 불
	A a3 = new A("문자열");	// 불가 
}
