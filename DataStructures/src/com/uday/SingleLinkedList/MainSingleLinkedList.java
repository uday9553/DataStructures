package com.uday.SingleLinkedList;


public class MainSingleLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleLinkedList sl=new SingleLinkedList();
		sl.add(10);
		sl.add(20);
		sl.insertAtBegin(5);
		sl.insertAtSpecificIndex(2, 4);
		
		sl.show();
		int x=sl.length();
		System.out.println("size is "+x);
		sl.delete(3);
		System.out.println("");
		sl.show();
		x=sl.length();
		System.out.println("size is "+x);
		System.out.println("reverse list is");
		sl.reverseList();
		sl.show();
	}

}
