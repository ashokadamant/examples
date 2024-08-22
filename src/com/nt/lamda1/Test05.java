package com.nt.lamda1;

interface I1{
	void m1(int p);
}

interface I2{
	void m2(int p,int q);
}
interface I3{
	void m1();
}
interface I4{
	int m1();
}
interface I6{
	String m1(int i1,float f);
}
interface I8{
	Person m1(Student s);
}
interface Person{
	
}
class Student implements Person{
	
}
interface I9{
	void m1(int a,String s);
}

public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    I1 i1=p->{System.out.println(p);};
    i1.m1(10);
    I2 i2=(p,q)->System.out.println(p+" "+q);i2.m2(23, 45);
    I1 i2a=p->System.out.println(p);
    I3 i3=()->{};//if you want to write empty body then {} mandatory.if we write
    //I3 i3=()->; we get error if we write like this
    I4 i41=()->{return 10;};
    I4 i42=()->10;
    I3 i31=()->{return;};
    I4 i43=()->10+20;//implicitly compiler i43=()->{return 10+20;};
    I1 i11=(p)->m2();
    I1 i12=p->m1();
    //Note:if a method is void method,inside method body without parenthesis,we can call void method or non void method.
    //if a method return type is void  we can't keep literal directly without paranthesis.
    // if a method is non void then we can keep literal directly without paranthesis bcz implicitly return statement is added.
    I4 i44=()->(short)10;
    I1 i13=(__)->{};
    
    I1 i14=(_$)->{};
    I1 i15=(var x)->{};
    I2 i21=(var x,var y)->{};
    
    /*
     * if we define le without body {},
     * 1)as varaiable assignment statement or as a method return value then at 
     * end ; is mandatory. else compiler will throw error.
     * 2)as method argument ; is not allowed. compiler will throw error.
     * if we define le with {},
     * in method argument ; at the end of body not allowed
     * in return and var assignment statement ; is mandatory at the end of {}.
     * 
     * 
     * Note:Inside Le body ,either le parameternames or le local variable names must not be 
     * same as the the names of enclosing methodparameter and local variable names in which we are creating le.
     * class Test{
     * psvm(string[] args){
     * int a=50;
     * int p=60;
     * Calc.eval((a,b)->{
     * int p=70;
     * sopln(a+b+p);
     * p=80;
     * }
     * }
     * here inside le we should take parameter as a and in body we should not recreate the variable specified in enclosing method.
     * but we can use in the le.
     * we should consider le as local block then already created variable in the method
     * should not be recreated,instead we should only access them.
     * 
     * Note:suppose if we create same name variable in super class and sub class and in sub class 
     * method's le also.then le local variable will be dominated if we print the that variable 
     * in le.because the local variable created in le scope is only of that method.
     * 
     * Note:this keyword in le referes  to enclosing method current object.In current object whatever the properties
     * are there we can access.
     * 
     */
    m3(()->{return 10;});
   // int a=10;
    int p=20;
    I9 i9=(a,s)->{
    //int p=30;	
    	int q=34;
    	q=90;
    //p=30;	local variable referenced from enclosing method implicitly final.
    	//they should not be modified in the le.
    	
    	
    	
    };
	}
	static void m1() {
		
	}
	static int m2() {
		return 10;
	}
	static void m3(I4 i4) {
		
	}
	static I4 m4() {
		return ()->{return 10;};
	}

}
