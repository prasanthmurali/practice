package helloWorld;

public class largestCommonSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    String s1 = "AGGTAB";
	    String s2 = "GXTXAYB";
	    int m = s1.length();
	    int n=s2.length();
	    System.out.println("LCS output is" + LCS(s1,s2,m,n));
	}

	public static int LCS(String s1, String s2, int m, int n)
	{
		if(m==0 || n==0)
			return 0;
		else if(s1.charAt(m-1)==s2.charAt(n-1))
			return 1 + LCS(s1,s2,m-1,n-1);
		else
			return max(LCS(s1,s2,m-1,n),LCS(s1,s2,m,n-1));
	}

	private static int max(int i, int j) {
		// TODO Auto-generated method stub
		int maxVal = i>j?i:j;
		return maxVal;
	}
}
