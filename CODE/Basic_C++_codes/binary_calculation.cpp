#include<bits/stdc++.h>
using namespace std;

void binary_calculation(string s){
    int calc;
    for(int i=0; i<s.length(); i++){
        calc = s[0];
        if(s[i] == 'A'){
            calc = calc & s[i+1];
        }
        else if(s[i] == 'B'){
            calc = calc | s[i+1];
        }
        else if(s[i] == 'C'){
            calc = calc ^ s[i+1];
        }
    }

    cout<< calc << endl;
}

int main(){

    string s = "1C0C1C1A0B1";

    binary_calculation(s);

    return 0;
}