#include <iostream>
using namespace std;
int main() {
    int n;
    cin >> n;
    while(n != -1){
        if(1<=n && n<=10){
            int s,tc,tp=0,m=0;
            for(int i=0;i<n;i++){
                cin >> s >> tc;
                if((1<=s && s<=90) && (1<=tc && tc<=12)){
                    m += s * (tc - tp);
                    tp = tc;
                }
            }
            cout << m << " miles\n";
        }
        cin >> n;
    }
}