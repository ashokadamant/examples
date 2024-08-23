package com.nt.genericlamda;

interface I1<T>{
	T m1(T t1,T t2);
}
interface I2<T,R>{
	R m1(T t1,T t2);
}
interface I3<T extends A>{
	void m1(T t);
}
class A{
	
}
class B extends A{
	
}
class C extends B{
	
}
class D{
	
}
public class GenericLamda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      I1<Integer> i1=(t1,t2)->t1+t2;
      I1<Double> i2=(t1,t2)->t1+t2+234;
      I2<Integer,String> i2a=(t1,t2)->t1+t2+" ashok";
      I2<Number,String> i2b=(t1,t2)->t1.intValue()+t2.doubleValue()+" kumar";
      System.out.println(i2b.m1(10, 100.f));
      System.out.println(i2.m1(10.0, 20.0));
      I2<Double,Integer> i2c=(t1,t2)->(int)(t1+t2);
      System.out.println(i2c.m1(23.4, 67.99));
      I3<A> i3=(t1)->System.out.println(t1);
    //  I3<D> i4= (t1)->System.out.println(t1);   D is not a subtype of A so we error.
      i3.m1(new B());
      
	}

}
