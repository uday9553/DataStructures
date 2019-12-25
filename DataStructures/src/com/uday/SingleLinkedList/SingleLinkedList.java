package com.uday.SingleLinkedList;
class SingleLinkedList{
	Node head;
	public void add(int data) {
		Node newNode=new Node();
		newNode.data=data;
		newNode.next=null;
		if(head==null) {
			head=newNode;
			System.out.println("value added at end "+newNode.data);
		}else {
			Node n=head;
			while(n.next!=null) {
				n=n.next;
			}
			n.next=newNode;
			System.out.println("value added at end "+newNode.data);
		}
		
	}
	public void insertAtBegin(int data) {
		//creating node
		Node newNode=new Node();
		newNode.data=data;
		newNode.next=null;
		
		newNode.next=head;
		head=newNode;
		System.out.println("value added at begin "+newNode.data);
	}
	
	public void insertAtSpecificIndex(int index,int data) {
		//creating node
		Node newNode=new Node();
		newNode.data=data;
		newNode.next=null;
		if(index>length()) {
			System.out.println("cannot insert");
		}if(index==length()) {
			Node n=head;
			while(n.next!=null) {
				n=n.next;
			}
			n.next=newNode;
			System.out.println("value added at index "+index +" is "+newNode.data);
		}
		else {
			int temp=0;
			Node n=head;
			if(temp==index) {
				newNode.next=head;
				head=newNode;
				System.out.println("value added at index "+index +" is "+newNode.data);
				return;
			}
			while(n.next!=null) {
				temp++;
				if(temp==index) {
					newNode.next=n.next;
					n.next=newNode;
					break;
				}
				n=n.next;
			}
			System.out.println("value added at index "+index +" is "+newNode.data);
			
		}
		
	}
	public void delete() {
		if(head==null) {
			System.out.println("list is empty no values to delete");
		}else {
			Node n=head;
			while(n.next.next!=null) {
				n=n.next;
			}
			n.next=null;
			System.out.println("value deleted is "+n.data);
		}
	}
	public void delete(int index) {
		if(index>length()) {
			System.out.println("deletion not possible at index "+index+" since list contains "+length() +"elements");
		}
		else {
			int temp=0;
			Node n=head;
			Node tempNode=null;
			if(temp==index) {
				
				head=n.next;
				n.next=null;
				System.out.println("value deleted at index "+index +" is "+n.data);
			}
			while(n.next!=null) {
				temp++;
				if(temp==index) {
					tempNode=n.next;
					n.next=tempNode.next;
					tempNode.next=null;
					break;
				}
				n=n.next;
			}
			System.out.println("value deleted at index "+index +" is "+tempNode.data);
			
		}
		
	}
	public void reverseList() {
		Node prev = null; 
        Node current = head; 
        Node next = null; 
        while (current != null) { 
            next = current.next; 
            current.next = prev; 
            prev = current; 
            current = next; 
        } 
        head = prev; 
	}
	public int length() {
		Node n=head;
		int length=0;
		if(n==null) {
			return 0;
		}
		while(n!=null) {
			length++;
			n=n.next;
		}
		return length;
	}
	public void show() {
		Node n=head;
		while(n!=null) {
			System.out.println(n.data);
			n=n.next;
		}
	}
}