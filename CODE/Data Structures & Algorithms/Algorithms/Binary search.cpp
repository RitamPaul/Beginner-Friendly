// Search the element using binary search method

#include <bits/stdc++.h>
using namespace std;
int BinarySearch(int nums[], int n, int target) {
        int start = 0 , end = n-1;
        while(start <= end ){
            int mid = start + (end - start)/2;

            if(nums[mid] == target) return mid;
            else if ( target > nums[mid]) start = mid+1;
            else end = mid-1;
        }
        return -1;
    }

int main()
{
	int nums[] = { 2, 3, 4, 10, 40, 55, 99 };
	int target = 10;
	int n = sizeof(nums) / sizeof(nums[0]);
	int result = BinarySearch(nums,n, target);
	(result == -1)
		? cout << "Element is not present in array"
		: cout << "Element is present at index " << result;
	return 0;
}


// Time complexity - O(log n)
// Space complexity - O(1)
