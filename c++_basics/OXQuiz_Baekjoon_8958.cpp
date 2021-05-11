#include <iostream>
#include <string>

using namespace std;

int main() 
{
	int num;
	string s;
	
	cin >> num;
	
	for(int i=0; i<num; i++) {
		cin >> s;
		int cnt, sum;
		cnt=sum=0;
		for(int j=0; j<s.length(); j++) {
			if(s[j] == 'O') cnt++;
			else cnt=0;
			sum += cnt;
		}
		cout << sum << "\n";
	}
	
	return 0;
}
