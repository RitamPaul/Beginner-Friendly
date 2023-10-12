/*

Question :- Maximum XOR subarray

Find the subarray from a given array with maximum XOR. A subarray is a contiguous part of the array.

Example:-

arr[] = {1,2,3,4}
Output: 7
Explanation: 
The subarray {3,4} has maximum xor value equal to 7.

*/

class xor {
	static int max_xor(int arr[], int n){
		int maxXor = 0;
		for (int i = 0; i < n; i++){
			for (int j = i + 1; j < n; j++){
				maxXor = Math.max(maxXor,
						arr[i] ^ arr[j]);
			}
		}
		return maxXor;
	}
	public static void main(String[] args) {
		int arr[] = {25, 10, 2, 8, 5, 3};
		int n = arr.length;
		System.out.println(max_xor(arr, n));
	}
} 

