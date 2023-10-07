// The following code is solution for 0/1 Knapsack Problem given below:

// Given N items where each item has some weight and profit associated with it and also given a bag with capacity W, 
// [i.e., the bag can hold at most W weight in it]. 
// The task is to put the items into the bag such that the sum of profits associated with them is the maximum possible. 

// Algorithm: 
// The maximum value obtained from ‘N’ items is the max of the following two values. 
// Case 1 (include the Nth item): Value of the Nth item plus maximum value obtained by remaining N-1 items and remaining weight i.e. (W-weight of the Nth item).
// Case 2 (exclude the Nth item): Maximum value obtained by N-1 items and W weight.
// If the weight of the ‘Nth‘ item is greater than ‘W’, then the Nth item cannot be included and Case 2 is the only possibility.


 public class Knapsack {

	// A utility function that returns
	// maximum of two integers
	static int max(int a, int b) { return (a > b) ? a : b; }

	// Returns the maximum value that
	// can be put in a knapsack of
	// capacity W
	static int knapSack(int W, int wt[], int val[], int n)
	{
		// Base Case
		if (n == 0 || W == 0)
			return 0;

		// If weight of the nth item is
		// more than Knapsack capacity W,
		// then this item cannot be included
		// in the optimal solution
		if (wt[n - 1] > W)
			return knapSack(W, wt, val, n - 1);

		// Return the maximum of two cases:
		// (1) nth item included
		// (2) not included
		else
			return max(val[n - 1]
						+ knapSack(W - wt[n - 1], wt,
									val, n - 1),
					knapSack(W, wt, val, n - 1));
	}

	// Driver code
	public static void main(String args[])
	{
		int profit[] = new int[] { 60, 100, 120 };
		int weight[] = new int[] { 10, 20, 30 };
		int W = 50;
		int n = profit.length;
		System.out.println(knapSack(W, weight, profit, n));
	}
}
