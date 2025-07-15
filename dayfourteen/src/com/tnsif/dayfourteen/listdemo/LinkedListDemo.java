package com.tnsif.dayfourteen.listdemo;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> li=new LinkedList<Integer>();
		
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		li.add(50);
		System.out.println(li);
		li.addFirst(90);
		li.addLast(80);
		System.out.println(li);
		
		li.add(5, 100);
		System.out.println(li);
		
		Iterator<Integer>ll=li.listIterator();
		
		while(ll.hasNext()) {
			System.out.print(ll.next()+"\t");
		}
	}
}
