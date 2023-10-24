#include<bits/stdc++.h>
using namespace std;

void duck(int n){
    string s = to_string(n);
    int i = 0;
    if(s[i] != '0'){
        cout << " Duck number"<<endl;
    }else {
        cout<<"not a duck number"<<endl;
    }
}

int main(){
    int n;
    cin >> n;
    duck(n);

    return 0;
}

// ans. galat aa rha hai .. sudhar dena