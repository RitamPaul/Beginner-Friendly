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

