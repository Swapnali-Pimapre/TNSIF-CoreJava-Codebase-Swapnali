package com.tnsif.dayfourteen.listdemo;

import java.util.ArrayDeque;
import java.util.Deque;

public class ExDequeDemo {

	public static void main(String[] args) {
		Deque<String>deque1=new ArrayDeque<String>();
				deque1.add("river");
				deque1.add("north");
				deque1.add("wolf");
				deque1.add("lion");
				deque1.add("yeti");
				deque1.add("timothy");
				
				System.out.println(deque1);
				
				System.out.println(deque1.poll());
				System.out.println(deque1);
				
				System.out.println(deque1.pollFirst());
				
				for(String str:deque1) {
					System.out.println("queue is:"+str);
				}
				System.out.println(deque1);
	}
}
