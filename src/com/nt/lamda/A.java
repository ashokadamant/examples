package com.nt.lamda;

public interface A {
    int start(int a);
    
    default A comparing(A a1) {
    	//int a=10;
    	System.out.println(this);
    	return (b)->{int b1= a1.start(b);
    	int b2=start(110);
    	System.out.println(b1);
    	System.out.println(b2);
    	int a=10;
    	int b10=89;
    	System.out.println(b10);
    	System.out.println(a);
    int	aa=a+b10;;
    	return b2;
    	};
    }
    
}
