package com.tnsif.dayfourteen.listdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		List list=new ArrayList();
		
		System.out.println(list.isEmpty());
		
		list.add(54);
		list.add(85);
		list.add(78);
		list.add(79);
		list.add("sia");
		list.add("ares");
		list.add(5.4f);
		list.add(true);
		list.add(false);
		list.add(54);
		
		System.out.println("List is"+list);
		
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		
		System.out.println(list.contains(54));
		
		System.out.println(list.get(3));
		
		System.out.println(list.getFirst());
		
		System.out.println(list.getLast());
		
		System.out.println(list.remove(false));
		
		System.out.println(list.remove(5));
		
		System.out.println(list);
		
		System.out.println(list.indexOf(54));
		
		System.out.println("--------------------------------");
		
		List<String>names=new ArrayList<String>();
		
		names.add("ares");
		names.add("henry");
		names.add(null);
		names.add("ryan");
		names.add("rose");
		names.add("Tiffany");
		names.add("ares");
		
		System.out.println(names);
		
		Collections.reverse(names);
		
		System.out.println(names);
		
		
		//traversing in list
		
		Iterator<String> i=names.iterator();
		while(i.hasNext()) {
			String nm=i.next();
			System.out.print(nm+" ");
		}
		
		System.out.println();
		System.out.println(names);
		
		ListIterator<String>li=names.listIterator(names.size());
		while(li.hasPrevious()) {
			String nm=li.previous();
		   System.out.println(nm+" ");	
		}
		
		
	}

}
