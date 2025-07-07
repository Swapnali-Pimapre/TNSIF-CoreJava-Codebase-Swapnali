package com.coding.questions;


class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
	}
}
public class MergeTwoSortedLinkedList {
	
	public static Node Merge(Node l1,Node l2) {
		Node dummy=new Node(0);
		Node tail=dummy;
		while(l1 !=null && l2 !=null) {
			if(l1.data<l2.data) {
				tail.next=l1;
				l1=l1.next;
			}
			else {
				tail.next=l2;
				l2=l2.next;
			}
			tail=tail.next;
			
		}
		if(l1!=null) {
			tail.next=l1;
		}
		if(l2 !=null) {
			tail.next=l2;
		}
		return dummy.next;
	}

	public static void printlist(Node head) {
		while(head!=null) {
			System.out.print(head.data+"->");
			head=head.next;
		}
		System.out.println("null");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node l1=new Node(1);
		l1.next=new Node(4);
		l1.next.next=new Node(5);
		
		Node l2 =new Node(2);
		l2.next=new Node(9);
		l2.next.next =new Node(10);
		
		Node merged=Merge(l1,l2);
		printlist(merged);
		

	}

}
