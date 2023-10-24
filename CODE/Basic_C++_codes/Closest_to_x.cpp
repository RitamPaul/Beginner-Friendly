#include <bits/stdc++.h>
using namespace std;

// Function to find the crossover point in the sorted array
int findCrossOver(int arr[], int low, int high, int x)
{
    if (arr[high] <= x)
        return high;
    if (arr[low] > x)
        return low;

    int mid = (low + high) / 2;

    if (arr[mid] <= x && arr[mid + 1] > x)
        return mid;

    if (arr[mid] < x)
        return findCrossOver(arr, mid + 1, high, x);

    return findCrossOver(arr, low, mid - 1, x);
}

// Function to print the K closest elements to X in a sorted array
void printKclosest(int arr[], int x, int k, int n)
{
    int l = findCrossOver(arr, 0, n - 1, x);
    int r = l + 1;
    int count = 0;

    if (arr[l] == x)
        l--;

    // Compare the elements at left and right and print the closest K elements
    while (l >= 0 && r < n && count < k)
    {
        if (x - arr[l] < arr[r] - x)
            printf("%d ", arr[l--]);
        else
            printf("%d ", arr[r++]);
        count++;
    }

    // If there are still K elements to print, handle the remaining left or right elements
    while (count < k && l >= 0)
        printf("%d ", arr[l--]), count++;

    while (count < k && r < n)
        printf("%d ", arr[r++]), count++;
}

int main()
{
    int arr[] = {12, 16, 22, 30, 35, 39, 42, 45, 48, 50, 53, 55, 56};
    int n = sizeof(arr) / sizeof(arr[0]);
    int x = 35, k = 4;

    // Call the printKclosest function to find and print the 4 closest elements to 35
    printKclosest(arr, x, k, n);

    return 0;
}

// Output : 30 39 42 45

/*
********************  Explanation:  *********************

1.The program starts with a sorted array arr containing integers and a target value x set to 35. It also specifies that it needs to find and print the 4 closest elements to x.

2.The findCrossOver function is used to find the index l, which is the largest element in the array less than or equal to x, and r which is the element just to the right of x.

3.Then, the program enters a loop to find and print the k closest elements to x. It compares the absolute differences between the target value x and the elements at l and r, and prints the one with the smaller difference. It updates l and r accordingly.

4.The loop continues until it has printed k closest elements or until it reaches the beginning or end of the array.

5.In this specific case, the 4 closest elements to 35 are 30, 39, 42, and 45, which are printed to the console.

*/
