package com.chapter13;

public class Stack<Item> {
	private Node first;
	private int N;

	public void push(Item item) {

		Node oldFirst = first;
		// Item oldItem=first.item;
		first = new Node();
		first.item = item;
		first.next = oldFirst;
		N++;
	}

	public boolean isEmpty() {
		return first == null;
	}
	
	public Item pop()
	{
		Node second=first.next;
		Item returnedItem = first.item;
		first=second;
		N--;
		return returnedItem;
	}
	public int size()
	{
		int size=0;
		for(Node x=first;x.next!=null;x=x.next)
		{
			size++;
		}
		return size;
	}

	class Node {
		Item item;
		Node next;
	}
}
