#include <bits/stdc++.h>

using namespace std;

bool check(int h, int m, int s) {
	if(h%10==3 || m%10==3 || m/10==3 || s%10==3 || s/10 ==3) return true;
	else return false;
}

int main() {
	int h=0;
	cin >> h;
	
	int cnt=0;
	
	for(int i=0; i<=h; i++) {
		for(int j=0; j<60; j++) {
			for(int k=0; k<60; k++) {
				if(check(i, j, k)) cnt++;
			}
		}
	}
	
	cout << cnt << '\n';
	
	return 0;
}
