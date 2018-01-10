package helloWorld;

public class editDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "geek";
		String s2 = "gesek";
		System.out.println(editDistance(s1,s2,4,5));

	}
	
	/*
	 * think of the recursion properly!!
	 */
	public static int editDistance(String s1, String s2, int m, int n)
	{
		if(m==0)
			return n;
		else if(n==0)
			return m;
		else if(s1.charAt(m-1)==s2.charAt(n-1))
			return editDistance(s1,s2,m-1,n-1);
		else 
			return 1+ min(
					editDistance(s1,s2,m-1,n-1),
					editDistance(s1,s2,m-1,n),
					editDistance(s1,s2,m,n-1));
					
	}
	
	public static int min(int a, int b, int c)
	{
		if(a<=b && a<=c)
			return a;
		else if(b<=a && b<=c)
			return b;
		else
			return c;
	}

}
