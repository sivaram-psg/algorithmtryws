package com.chapter15;

public class QuickFind {
private int id[];
private int N;
public QuickFind(int N)
{
	id=new int[N];
	for(int i=0;i<N;i++)
	{
		id[i]=i;
	}
}

public void union(int p,int q)
{
	int pId=find(p);
	int qId=find(q);

	if(pId==qId)
		return;
	else
	{
	for(int i=0;i<N;i++)
	{
	if(id[i]==pId)
		id[i]=qId;
	}
	}
}

public int find(int p)
{
	return id[p];
}

public boolean connected(int p,int q)
{
	return find(p)==find(q);
}

}
