package com.chapter2;

public class SortCompare {
public static <T> double time(String alg,Comparable<T>[] a)
{
	Stopwatch timer=new Stopwatch();
	if(alg.equals("Insertion"))
	{
		InsertionSort.sort(a);
	}
	return timer.elapsedTime();
}


public static void main(String args[])
{
	String array[]=new String[5];
	array[0]="S";
	array[1]="O";
	array[2]="R";
	array[3]="T";
	array[4]="E";
	InsertionSort.sort(array);
    SortTemplate.show(array);
    
			
}
}
