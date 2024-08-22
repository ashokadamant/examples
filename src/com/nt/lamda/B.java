package com.nt.lamda;

public interface B {
  int end(int b);
  int end1(int b);
  default  int comp1(int b) {
	  System.out.println("comp1 default impl");
	
	  comp2(345);
	  System.out.println(this);
	  int v=this.comp5(11);
	  System.out.println(v);
	  this.comp3(444);
	  return 1;
  }
  static int comp2(int b) {
	  System.out.println("comp2 static impl");
	  comp4(44);
	  return 2;
  }
  private  int comp3(int c) {
	  System.out.println("comp3 private non static ");
	  System.out.println(this);
	  this.end1(99);
	  System.out.println(c);
	  return 23;
  }
  private static int comp4(int d) {
	  
	  return 4;
  }
  default int comp5(int d) {
	  return 33;
  }
}
