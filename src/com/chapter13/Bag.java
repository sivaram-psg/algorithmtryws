package com.chapter13;

import java.util.Iterator;

public class Bag<Item> implements Iterable<Item> {
	private Node first;
	private int N;

	public void add(Item item) {

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

	@Override
	public Iterator<Item> iterator() {
		return new ListIterator();
	}
	class ListIterator implements Iterator<Item>
	{

		private Node current=first;
		@Override
		public boolean hasNext() {
			return current!=null;
		}

		@Override
		public Item next() {
			Item item=current.item;
			current=current.next;
			return item;
		}

		@Override
		public void remove() {
			// TODO Auto-generated method stub
			
		}
		
	}
}

