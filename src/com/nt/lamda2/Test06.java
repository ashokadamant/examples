package com.nt.lamda2;

interface I1{
	void m1(int a,String s);
}
interface I2{
	void m1() throws InterruptedException;
}
interface I3{
	void m1();
}
class A{
	int a=10;
	
}
class B extends A{
	int a=12;
	int b=20;
	void m1() {
		I1 i1=(a,s)->{
			int b=30;System.out.println(super.a+" "+this.a);
			System.out.println(this.b);
			System.out.println(b);
			System.out.println(a+" "+s);
			
		};
	    i1.m1(10,"ashok");
	}
}
public class Test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* B b1=new B();
		 b1.m1();
		*/	
		I2 i2=()->{};
		I2 i21=()->{throw new InterruptedException();};//when you are writing since it is a single statement,we try not to take 
		//{} but this not works out.we have to take body when we have single statement ie. throw clause
		I2 i22=()->{try{throw new ClassNotFoundException();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		};//if you catch the unreported exception then no problem.if you want to report then only we check with method prototype.
		//of the fi.
		I2 i23=()->{throw new ArithmeticException();};//we can throw unchecked exception there is no problem.
		I3 i3=()->{};
		I3 i31=()->{throw new RuntimeException();};//if we throw unchecked exception
	//we need to report it.
		
		}

}
/*
 * if we declare le enclosing method as static we cannot use this and super
 * because static method doesnot have current object.we need to create object expllicitly in
 * static method and call variables.
 * 
 * Note:The exception we are throwing the le body must match to exception reported in interface method declaration.if exception throwing
 * is unchecked then no problem.
 */
