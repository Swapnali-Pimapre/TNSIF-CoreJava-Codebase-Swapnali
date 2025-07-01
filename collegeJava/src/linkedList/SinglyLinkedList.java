package linkedList;

public class SinglyLinkedList {
	public class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	 Node head;
	public void insertFront(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			return;
		}
		newNode.next=head;
		head=newNode;
		
	}
	public void insetBack(int data) {
		
		Node newnode=new Node(data);
		if(head==null) {
			head=newnode;
			return;
		}
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
			
		}
		temp.next=newnode;
	}
	public void atPos(int data,int pos) {
		Node newnode=new Node(data);
		if(pos==0) {
			newnode.next=head;
			head=newnode;
			return;
		}
		Node current=head;
		for(int i=0;i<pos-1;i++) {
			if(current==null) {
				System.out.println("position out of bound");
			}
			current=current.next;
		}
		newnode.next=current.next;
		current.next=newnode;
	}
	public void printlist() {
		Node temp=head;
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
		
			while(temp!=null) {
				System.out.print(temp.data+" ->");
				temp=temp.next;
			}
			System.out.println("null");
		
	}
	public void deleteAtBeggining() {
		if(head==null) {
			return;
		}
		head=head.next;
	}
	public void deleteAtEnd() {
		if(head==null || head.next==null) {
			head=null;
			return;
		}
		Node current=head;
		while(current.next.next!=null) {
			current =current.next;
		}
		current.next=null;
	}
	public void deleteAtpos(int pos) {
		if(head==null) {
			System.out.println("list is empty");
		}
		if(pos==0) {
			head=head.next;
			return;
		}
		Node current=head;
		for(int i=0;i<pos-1;i++) {
			if(current==null || current.next==null) {
				System.out.println("position out of bound");
				return;
			}
			current=current.next;
		}
		current.next=current.next.next;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList l1=new SinglyLinkedList();
		l1.printlist();
		l1.insetBack(9);
		l1.insertFront(5);
		l1.insertFront(7);
		
		l1.insetBack(1);
		l1.printlist();
		l1.atPos(52, 3);
		l1.printlist();
		l1.deleteAtBeggining();
		l1.printlist();
		l1.deleteAtEnd();
		l1.printlist();
		l1.deleteAtpos(2);
		l1.printlist();

	}

}
