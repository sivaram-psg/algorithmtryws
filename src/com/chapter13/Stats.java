package com.chapter13;

public class Stats {
public static void main(String args[])
{/*
	FixedCapacityStackOfStrings fixedCapacityStackOfStrings=new FixedCapacityStackOfStrings(5);
	fixedCapacityStackOfStrings.push("plate 1");
	fixedCapacityStackOfStrings.push("plate 2");
	fixedCapacityStackOfStrings.push("plate 3");
	System.out.println("stack contents"+fixedCapacityStackOfStrings.pop());
	System.out.println("stack contents"+fixedCapacityStackOfStrings.pop());
	System.out.println("stack contents"+fixedCapacityStackOfStrings.pop());
	
	FixedCapacityStack<Double> stackDouble=new FixedCapacityStack<Double>(5);
	System.out.println("stack starting"+stackDouble.isEmpty());
	System.out.println("stack size"+stackDouble.size());
	stackDouble.push(20.0);
	stackDouble.push(25.00);
	
	System.out.println("stack contents"+stackDouble.pop());
	System.out.println("stack contents"+stackDouble.pop());
	System.out.println("stack contents"+stackDouble.isEmpty());
	FixedCapacityStack<String> fixedCapacityStackOfStringsb=new FixedCapacityStack<String>(2);
	fixedCapacityStackOfStringsb.push("link1");
	fixedCapacityStackOfStringsb.push("link2");
	fixedCapacityStackOfStringsb.push("link3");
	for(String str:fixedCapacityStackOfStringsb)
	{
		System.out.println("stack contents from collection"+str);
	}
	System.out.println("stack contents"+fixedCapacityStackOfStringsb.pop());
	System.out.println("stack contents"+fixedCapacityStackOfStringsb.pop());
	System.out.println("stack contents"+fixedCapacityStackOfStringsb.isEmpty());
	System.out.println("stack contents"+fixedCapacityStackOfStringsb.pop());
	System.out.println("stack contents"+fixedCapacityStackOfStringsb.isEmpty());*/
	Stack<String> stackString=new Stack<String>();
	stackString.push("sivaram");
	stackString.push("siranjeevi");
	System.out.println("stack contents "+stackString.pop());
	System.out.println("stack contents "+stackString.pop());
	
	Queue<String> queueString=new Queue<String>();
	queueString.enqueue("sivaram");
	queueString.enqueue("siranjeevi");
	System.out.println("Queueu contents "+queueString.dequeue());
	System.out.println("Queue contents "+queueString.dequeue());
	
	Bag<String> strBags=new Bag<String>();
	strBags.add("bag1");
	strBags.add("bag2");
	for(String str:strBags)
	{
		System.out.println("bag contents"+str);
	}
}
}
