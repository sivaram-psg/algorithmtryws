package com.chapter13;


public class Queue<Item> {
	private Node first;
	private Node last;
	private int N;

	public void enqueue(Item item) {

		Node oldlast = last;
		// Item oldItem=first.item;
		last = new Node();
		last.item = item;
		if(isEmpty())first=last;
		else
		oldlast.next = last;
		N++;
	}

	public boolean isEmpty() {
		return first == null;
	}
	
	public Item dequeue()
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
