package day07.modi.member.pac2;

import day07.modi.member.pac1.A;

public class C {

	public C( ) {
//		A의 기능
		A a = new A();
		a.var1 = 1;
//		a.var2 = 2; // no - default
//		a.var3 = 3; // no - private

		a.method01();
//		a.method02(); // no - default
//		a.method03(); // no - private
	}
}
