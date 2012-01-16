package com.chapter15;

public class QuickUnion {

	private int[] id;
	private int count;
	
public QuickUnion(int N)
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
	int proot=find(p);
	int qroot=find(q);
	if(proot==qroot) return;
	id[proot]=qroot;
	count--;
}

public int find(int p)
{
	while(p!=id[p])
		p=id[p];
	return p;
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
