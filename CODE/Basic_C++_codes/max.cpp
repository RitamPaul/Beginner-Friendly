// Calculating maximum value in a non-empty array using Recursion
#include <iostream>
using namespace std; 
int maximum(int a[], int n)
{
    if(n==0)
    {
        return a[n];
        return max(a[n-1], maximum(a, n-1));
    }
    int max = maximum(a, n-1);
    if(max<a[n])
        max = a[n];
        return max;
}
int main()
{
    int a[] = {1, 4, 35, 6, -20, 5, 2};
    int n = sizeof(a) / sizeof(a[0]) - 1;
    cout<<maximum(a, n)<<endl;
    return 0;
}