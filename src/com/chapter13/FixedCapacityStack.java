package com.chapter13;

import java.util.Iterator;

public class FixedCapacityStack<Item> implements Iterable<Item> {

	private Item[]a;
	private int N;
	@SuppressWarnings("unchecked")
	public FixedCapacityStack(int capacity)
	{
		a=(Item[])new Object[capacity];
	}
	
	public void push(Item item)
	{
		if(N==a.length)
		{
			resize(2*a.length);
		}
		a[N++]=item;
	}
	public boolean isEmpty()
	{
		return N==0;
	}
	public Item pop()
	{
		Item itempopped=a[--N];
		a[N]=null;
		if(N>0 && N==a.length/4)resize(a.length/2);
		return itempopped;
	}
	public int size()
	{
		return a.length;
	}
	
	private void resize(int max)
	{
		@SuppressWarnings("unchecked")
		Item[]temp=(Item[])new Object[max];
		for(int i=0;i<N;i++)
		{
			temp[i]=a[i];
		}
		a=temp;
	}

	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return new ReverseArrayIterator<Item>();
	}
	
	private class ReverseArrayIterator<Item>
	implements Iterator<Item> {

		private int i=N;
		
		@Override
		public boolean hasNext() {
			return i>0;
		}

		@Override
		public Item next() {
			return (Item) a[--i];
		}

		@Override
		public void remove() {
			// TODO Auto-generated method stub
			
		}

	}

}
