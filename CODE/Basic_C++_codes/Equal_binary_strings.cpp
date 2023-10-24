#include<bits/stdc++.h>
using namespace std;

bool String_check(string s1, string s2){
    sort(s1.begin(), s1.end());
    sort(s2.begin(), s2.end());

    if(s1 == s2){
        return true;
    }else{
        return false;
    }
}

int main(){

    string s1;
    string s2;

    cout<< " enter s1: "<<endl;
    cin>>s1;
    cout<<" enter s2: "<<endl;
    cin>>s2;

    if(String_check(s1,s2)){
        cout<<"true"<<endl;
    }else{
        cout<<"false"<<endl;
    }

    return 0;
}