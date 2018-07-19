package algorithms;

public class QuickUnionUF {

	private int[] id;
	public QuickUnionUF(int n) {
		id = new int[n];
		
		for(int i=0;i<n;i++)
			id[i] = i;
	}
	
	private int root(int i) {
		while(i!=id[i])
			i=id[i];
		return i;
	}
	
	public void union(int p, int q) {
		int rootOfP = root(p);
		int rootOfQ = root(q);
		
		id[rootOfP] = rootOfQ;
	}
	
	public boolean isConnected(int p, int q) {
		return root(p) == root(q);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
