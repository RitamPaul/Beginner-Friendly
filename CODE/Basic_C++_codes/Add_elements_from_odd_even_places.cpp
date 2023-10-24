#include <bits/stdc++.h>
using namespace std;

// Function to perform addition of the second largest even and odd numbers in a vector
int addition(vector<int> &nums)
{
    int sum = 0;
    vector<int> even;
    vector<int> odd;

    // Separate even and odd numbers into two different vectors
    for (int i = 0; i < nums.size(); i++)
    {
        if (i == 0)
        {
            even.push_back(nums[i]);
        }
        else if (i % 2 != 0)
        {
            odd.push_back(nums[i]);
        }
        else
        {
            even.push_back(nums[i]);
        }
    }

    // Sort both even and odd vectors in ascending order
    sort(even.begin(), even.end());
    sort(odd.begin(), odd.end());

    // Calculate the sum of the second largest even and odd numbers
    sum = even[even.size() - 2] + odd[odd.size() - 2];

    return sum;
}

int main()
{

    // Input vector of numbers
    vector<int> nums = {3, 2, 1, 7, 5, 4};

    // Call the 'addition' function with the input vector
    cout << addition(nums) << endl;

    return 0;
}

// Output : 7

/*
********************  Explanation:  *********************

1.The program starts with the input vector nums, which contains the numbers {3, 2, 1, 7, 5, 4}.

2.In the addition function, it separates even and odd numbers into two different vectors (even and odd).

3.It then sorts both even and odd vectors in ascending order.

4.Finally, it calculates the sum of the second largest even and odd numbers, which are 4 (second largest even) and 5 (second largest odd), resulting in a sum of 9.

5.The sum, 9, is then printed to the console.

*/
