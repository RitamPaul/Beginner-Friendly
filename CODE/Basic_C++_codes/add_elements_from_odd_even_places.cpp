#include<bits/stdc++.h>
using namespace std;

int addition(vector<int> &nums){
    int sum = 0;
    vector<int> even;
    vector<int> odd;

    for(int i = 0; i < nums.size(); i++){
        if( i == 0){
            even.push_back(nums[i]);
        }
        else if(i%2 != 0){
            odd.push_back(nums[i]);
        }else{
            even.push_back(nums[i]);
        }
    }

    sort(even.begin(),even.end());
    sort(odd.begin(),odd.end());

    sum = even[even.size() - 2] + odd[odd.size() - 2];

    return sum;
}

int main(){

    vector<int> nums = {3,2,1,7,5,4};

    // cout << " Enter nums: ";
    // int a;

    // for(int i=0; i<6; i++){
    //     cin >> a;
    //     nums.push_back(a);
    // }

    cout<< addition(nums)<<endl;

    return 0;
}