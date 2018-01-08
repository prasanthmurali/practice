package helloWorld;

public class stack {
	private static int MAX = 1000;
	private static int minimumVal = 9999;
	int top;
	int[] arr = new int[MAX];
	
	boolean isEmpty()
	{
		return (top<0);
	}
	
	public stack()
	{
		top = 0;
	}
	
	boolean push(int x)
	{
		if(top>=MAX)
		{
			System.out.println("Stack Overflow");
			return false;
		}
		else if(top<0)
		{
			top = 0;
			top = top+1;
			return true;
		}
		else
		{
			arr[top] = x;
			top = top+1;
			return true;
		}
	}
	
	int top()
	{
		if(top<0)
		{
			System.out.println("Stack empty");
			return 0;
		}
		else
			return arr[top-1];
	}
	
	int pop()
	{
		if(top<=0)
		{
			System.out.println("Stack empty");
			return 0;
		}
		else
		{
			top = top-1;
			return arr[top];
		}
	}
	
	/*
	 * Given: The unsorted stack s, sorted stack r (in decreasing 
	 * 		  order)
	 * Recursively sort the stack
	 * Eg : Given: -3,14,18,-5,30 Result: 30 18 14 -3 -5
	 */
	public static stack recursiveSort(stack s,stack r)
	{
		if(s.top==0)
		{
			return r;
		}
		else
		{
			insertSorted(s.pop(),r, new stack());
			return recursiveSort(s,r);
		}
	}
	
	/*
	 * Insert the new element into the right position in the sorted stack
	 * r
	 */
	
	private static void insertSorted(int pop, stack r,stack t) {
		// TODO Auto-generated method stub
		if(r.top<0)
			return;
		else if(r.top==0)
		{
			r.push(pop);
			copyElementsBetweenStacks(t,r);
		}
		else
		{
			int x = r.pop();
			if(pop<x)
			{
				t.push(x);
				insertSorted(pop,r,t);
			}
			else
			{
				t.push(pop);
				t.push(x);
				copyElementsBetweenStacks(r,t);	
				copyElementsBetweenStacks(t,r);
			}
		}
	}

	/*
	 * Copy elements from stack one to stack two
	 */
	private static void copyElementsBetweenStacks(stack r, stack t) {
		// TODO Auto-generated method stub
		if(r.top<=0)
			return;
		else
		{
			t.push(r.pop());
			copyElementsBetweenStacks(r,t);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stack s = new stack();
		s.push(7);
		s.push(-5);
		s.push(18);
		s.push(72);
		s.push(14);
		s.push(-3);
		
		stack sortedStack = recursiveSort(s,new stack());
		printStack(sortedStack);
	}

	/*
	 * Print elements of the stack 
	 * Warning: Pops all elements of the stack
	 */
	public static void printStack(stack s)
	{
		if(s.top<=0)
			return;
		else
		{
			System.out.println(s.pop());
			printStack(s);
		}
	}
	
}
