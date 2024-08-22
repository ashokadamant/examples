package com.nt.lamda;

public class LamdaExp {
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		A a=LamdaExp.reverse(10);
		System.out.println(a);
		int v1=a.comparing((b)->b+10).start(10000);
		System.out.println(v1);
		int v=a.start(100);
		System.out.println(v);
        
	}
	
   static A reverse(int b) {
	   System.out.println(b);
	   return (a)->{
		   System.out.println("ashok");
		   
		   return a+b; 
	   };
   }

}
