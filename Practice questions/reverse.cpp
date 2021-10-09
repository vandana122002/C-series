#include<iostream>
#include<bits/stdc++.h>
using namespace std;
#include<vector>


vector<string> split(string str){
    vector<string> v;
    string word = "";
    for (auto x : str) 
    {
        if (x == ' ')
        {
             v.push_back(word);
            word = "";
        }
        else {
            word = word + x;
        }
    }
    v.push_back(word);
    return v;
}


int main()
{
    int t;
    cin>>t;
    // t=5;
    cin.ignore();
    while(t-->0)
    {
        vector<string> v;
        string ch;
        getline(cin,ch);
        v=split(ch);
        cout<<"\n";
            for (int i = v.size()-1; i >=0; i--)
            {
                cout << v[i] << ' ';
            }
            cout<<"\n";
    }
    return 0;
}