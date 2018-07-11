package helloWorld;

public class allPermutations {
	
	public static void main(String[] args) {
	
	String str = "Hey";
	permutations(str, "");
	}

	private static void permutations(String str, String prefix) {
		// TODO Auto-generated method stub
		if(str.length()==0)
		{
			System.out.println(prefix);
		}
		else
		{
			for(int i=0;i<str.length();i++) {
				String remaining = str.substring(0, i) + str.substring(i+1);
				permutations(remaining,prefix+Character.toString(str.charAt(i)));
			}
		}
		
	}

}
