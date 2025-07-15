package com.tnsif.dayfourteen.listdemo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExQueue1 {

	public static void main(String[] args) {
		Queue<Integer>r=new LinkedList<Integer>();
		r.add(6);
		r.add(8);
		r.add(45);
		r.add(21);
		r.add(12);
		System.out.println(r);
		
		System.out.println(" returns Peek of a Queue");
		System.out.println(r.peek());
		
		System.out.println("REmoves element first");
		System.out.println(r.remove());
		
		System.out.println(r.remove(3));
		
		System.out.println(r.element());
		
		System.out.println();
		
		Iterator itr=r.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		System.out.println(r.poll());
	}
}
