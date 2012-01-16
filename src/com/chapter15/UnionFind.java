package com.chapter15;

public class UnionFind {

	private int[] id;
	private int count;
	
public UnionFind(int N)
{
	count =N;
	id=new int[N];
	for(int i=0;i<N;i++)
	{
		id[i]=i;
	}
}

public void union(int p,int q)
{
	
}

public int find(int p)
{
	return 0;
}

public boolean connected(int p,int q)
{
	return find(p)==find(q);
}

public int count()
{
	return count;
}
}
