package com.chapter2;
import com.chapter2.SortTemplate;
public class InsertionSort {
public static <T> void sort(Comparable<T>[] a)
{
	for(int i=0;i<a.length;i++)
	{
		for(int j=i; j>0 && SortTemplate.less(a[j],a[j-1]);j--)
		{
			SortTemplate.exch(a, j, j-1);
		}
		System.out.print("Insertion sort in progress");
		SortTemplate.show(a);
	}
}
}
