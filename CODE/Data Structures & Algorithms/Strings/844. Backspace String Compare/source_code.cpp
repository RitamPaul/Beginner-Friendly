class Solution {
public:
    bool backspaceCompare(string s, string t) {
        unordered_map<string,bool> mp;
        string str = "";
        for(int i = 0; i < s.size(); ++i){
            if(s[i] != '#')     str.push_back(s[i]);
            else if(s[i] == '#' and str.size())       str.pop_back();
        }
        mp[str] = true;
        str = "";
        for(int i = 0; i < t.size(); ++i){
            if(t[i] != '#')     str.push_back(t[i]);
            else if(t[i] == '#' and str.size())       str.pop_back();
        }
        return mp[str] == true;
    }
};