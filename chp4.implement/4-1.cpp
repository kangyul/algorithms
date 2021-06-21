#include <bits/stdc++.h>

using namespace std;

int dx[4] = {0, 0, -1, 1};
int dy[4] = {-1, 1, 0, 0};

char moveTypes[4] = {'L', 'R', 'U', 'D'};

int x = 1, y = 1;

int main(void) {
	int n;
	cin >> n;
	string plans;
	cin.ignore();
	getline(cin, plans);
	
	for(int i=0; i<plans.size(); i++) {
		char plan = plans[i];
		int nx = -1, ny = -1;
		for(int j=0; j<4; j++) {
			if(plan == moveTypes[j]) {
				nx = x + dx[j];
				ny = y + dy[j];
			}
		}
		if(nx < 1 || ny < 1 || nx > n || ny > n) continue;
		x = nx;
		y = ny;
	}
	
	cout << x << ' ' << y << '\n';
	
	return 0;   
}
