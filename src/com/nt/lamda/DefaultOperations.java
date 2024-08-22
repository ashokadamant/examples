package com.nt.lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class DefaultOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        B b=new BImp();
       int v= b.end(1000);
       System.out.println(v);
       List<Integer> l=new ArrayList<>(Arrays.asList(10,11,12,67,1,4,1,100));
     //  ListIterator<? super Integer> i=l.listIterator();
     //  System.out.println(i.next());
      // i.add(1000);
       ListIterator< Integer> i=l.listIterator();
       System.out.println(l.get(0));
      // i.add();
       i.next();
       i.remove();
       System.out.println(l);
       System.out.println(l.get(0));
       System.out.println(l.remove(0));
       System.out.println(l);
       System.out.println(l.get(0));

     list1(l);
       
       
	}
	static void list1(List<? extends Integer> l) {
		int i=l.get(0);
		System.out.println(l.get(0));
		//l.add(10);
		System.out.println(l);
	}

}
