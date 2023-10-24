#include <bits/stdc++.h>
using namespace std;

void rotate(int i, int arr[], int n){
    if(i > n){
        return;
    }
    
    while(i == n-i-1){
        int temp = arr[i];
        arr[i] = arr[i+1];
        arr[i+1] = temp;
    }

    rotate(i+1, arr, n);

    cout << arr << endl;
}

int main(){
    int arr[] = { 1,2,3,4,5};
    int n;
    cin>>n;

    rotate(0, arr, n);

    return 0;
}