#include <bits/stdc++.h>
using namespace std;

int main(){
    long long n;
    cin >>n;
    cout << (n%2==0?(n%4 == 0 ? n/4-1 :n/4):0 )<< endl; 

    return 0;
}