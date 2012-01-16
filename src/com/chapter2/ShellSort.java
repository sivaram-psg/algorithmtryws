package com.chapter2;
public class ShellSort {

	public static <T> void sort(Comparable<T>[] a)
	{
		int N=a.length;
		int h=1;
		while(h<N/3)
		{
			h=3*h+1;
		}
		while(h>=1)
		{
		for(int i=h;i<=N;i++)
		{
			for(int j=i;j>0&&SortTemplate.less(a[j],a[j-h]);j-=h)
			{
				SortTemplate.exch(a, j, j-h);
			}
		}
		h=h/3;
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] array=new String[13];
		array[0]="S";
		array[1]="H";
		array[2]="E";
		array[3]="L";
		array[4]="L";
		array[5]="S";
		array[6]="O";
		array[7]="R";
		array[8]="T";
		array[9]="E";
		array[10]="X";
		
		array[11]="A";
		array[12]="M";
		array[13]="P";
		array[14]="L";
		array[15]="E";

	}

}
