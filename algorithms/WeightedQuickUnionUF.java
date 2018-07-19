package algorithms;

import java.util.Arrays;

public class WeightedQuickUnionUF {

	private int[] id;
	private int[] sz;
	public WeightedQuickUnionUF(int n) {
		id = new int[n];
		sz = new int[n];
		for(int i=0;i<n;i++) {
			id[i] = i;
			sz[i] = 1;
		}
	}
	
	private int root(int i) {
		while(i!=id[i])
			i=id[i];
		return i;
	}
	
	public void union(int p, int q) {
		int rootOfP = root(p);
		int rootOfQ = root(q);	
		if(rootOfP==rootOfQ)
			return;
		if(sz[rootOfP]<=sz[rootOfQ]) {
			id[rootOfP]=rootOfQ;
			sz[rootOfQ]+=sz[rootOfP];
		}
		else {
			id[rootOfQ]=rootOfP;
			sz[rootOfP]+=sz[rootOfQ];
		}
	}
	public boolean isConnected(int p, int q) {
		return root(p) == root(q);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeightedQuickUnionUF w = new WeightedQuickUnionUF(5);
		for(int i=0;i<5;i++) {
			System.out.println(Integer.toString(w.id[i])+
					" "+Integer.toString(w.sz[i]));
		}

	}

}