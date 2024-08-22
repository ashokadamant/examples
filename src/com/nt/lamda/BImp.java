package com.nt.lamda;

public class BImp implements B{

	@Override
	public int end(int b) {
		// TODO Auto-generated method stub
		System.out.println(b);
		System.out.println("end");
		comp1(10);
		
		B.comp2(234);
		return 100;
	}
	/*public int comp1(int b) {
		B.super.comp1(234);
		return 100;
	}*/

	@Override
	public int end1(int b) {
		// TODO Auto-generated method stub
		System.out.println("end1 in BImp");
		System.out.println(this);
		return 0;
	}
	@Override
	public int comp5(int b) {
		System.out.println("comp5 in BImp");
		int c=B.super.comp5(22);
		System.out.println(c);
		return 999;
	}

};