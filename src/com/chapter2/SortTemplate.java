package com.chapter2;

import java.util.ArrayList;
import java.util.List;

public class SortTemplate {
public static <T> void sort(Comparable<T>[] a)
{
	
}

@SuppressWarnings("unchecked")
public static <T> boolean less(Comparable<T> v,Comparable<T> w)
{
	return v.compareTo((T) w)<0;
}

public static <T> void exch(Comparable<T>[]a, int x,int y)
{
	/*for(int i=0;i<a.length;i++)
	{
		if (a[i]==x)
		{
			a[i]=y;
		}
		else if(a[i]==y)
		{
			a[i]=x;
		}
	}*/
	T temp=(T) a[x];
	a[x]=a[y];
	a[y]=(Comparable<T>) temp;
}

public static <T> boolean  isSorted(Comparable<T>[] arr)
{
	for(int i=0;i<arr.length;i++)
	{
		if(less(arr[i], arr[i-1]))
		{
			continue;
		}
		else
			return false;
	}
	return true;
}



public static <T> void show(Comparable<T>[] arr)
{
	for(int i=0;i<arr.length;i++)
	{
		System.out.println("array contents  "+arr[i]);
	}
}

public static void main(String args[])
{
	String[] lstString=new String[3];
	
	lstString[0]="ahmd";
	lstString[1]="chen";
	lstString[2]="bomb";
	sort(lstString);
	assert(isSorted(lstString));
	show(lstString);
}
}
