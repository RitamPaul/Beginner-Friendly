#include<bits/stdc++.h>
#include<string>

using namespace std;

void replace(long long int n){

    if(n < 0){
        cout << "Wrong input" << endl;
    }else{
        string s = to_string(n);
        int ans;
        for (int i = 0; i < s.size(); i++)
        {
            char a = s[i];
            cout << int('9' - a) << " ";
        }
    }
    
}

int main(){

    long long int n;
    cout<< " Enter n: ";
    cin>>n;

    replace(n);

    return 0;
}