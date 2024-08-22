package com.nt.genericlamda;


interface I4{
	void m1();
	
}
interface I5{
	void m1(int i);
}
interface I6{
	void m1(long i);
}
interface I7{
	Integer  m1();
}
interface I8{
	byte m1();
}
interface I9{
	int m1();
}
interface I10{
	int m1(int i);
}
interface I11{
	long m1(long i);
}
interface I12{
	int m1(long i);
}
class Example{
	static void m5(I4 i4) {
		System.out.println("I4 parameter method is executed");
	}
	static void m5(I5 i5) {
		System.out.println("I5 parameter methodis executed");
	}
	static void m5(I6 i6) {
		System.out.println("I6 parameter method is executed");
	}
	static void m5(I7 i7) {
		System.out.println("I7 parameter method is executed");
	}
	static void m5(I8 i8) {
		System.out.println("I8 parameter method is executed");
	}
	static void m5(I9 i9) {
		System.out.println("I9 parameter method is executed");
	}
	static void m5(I10 i10) {
		System.out.println("I10 param method is executed.");
	}

	static void m5(I11 i11) {
		System.out.println("I11 param method is executed.");
	}
	static void m5(I12 i12) {
		System.out.println("I12 param method is executed");
	}
		static byte m6() {
		//m7(10); while returning we can keep byte as return type and pass integer within range of byte so no problem.but
		//while passing as parameter by keeping byte as parameter we should not able topasss even integer values withing range of byte also.we shoould explicitly
		//typecast and pass (byte)10 like this.slly in le return type also if we kept byte and int and value we pass within range of byte and then byte return type method
		//dominates and if we pass integer beyond the byte range then int return type method mapped.
		
		return 9;
	}
	static void  m7(byte b) {
		
	}
}
public class OverloadedLamda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     // System.out.println(()->{}); println does not have fi interface parameter.
		Example.m5(()->{});
		//Example.m5((p)->{});//generally we able to decide which overload to be executedbased on
		// Interface method prototype ie. return type and paramter.since we are giving le as 
		//without data type of parameter so it checks by only return type.if we give data type of
		//parameter also then compiler trying to map le with input param data type and le return type having
		//interface method.
		//Note:suppose if parameters and return type also same,then we typecast to the required interface.
		Example.m5((int p)->{});
		Example.m5((long p)->{});
		//or
		Example.m5((I5)(p)->{});
		Example.m5((I6)(p)->{});
		
		/*
		 * But if input parameter is same and based on the return type if we want to decide then first primitive->primitive upcast->wrapper->wrapper upcast->primiive var arg->primitive var arg upcast->
		 * wrapper var arg->wrapper var arg upcast if we passing primitive type data.
		 * 
		 */
		Example.m5(()->{return 12;});//Even though int and long m=both are matched first prefrence to primitive then only primitive upcast.
		//Example.m5(()->{return 5l;});
		
		Example.m5((I8)()->{return 5;});//we can explicitly typecast to I8 interface if return type as int matched to long.
		Example.m5((long p)->{return 11;});
		
	}

}