#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main()
{
	vector<int> v;
	int num;
	cin >> num;
	int arr[num];
	
	for(int i=0; i<num; i++) {
		int x;
		cin >> x;
		v.push_back(x);
	}
	
	sort(v.begin(), v.end());
	
	int index = num / 2;
	arr[index] = v[num-1];
	
	int chgSign = 1;
	int newIndex = index;
	for(int i=1; i<num; i++) {
		chgSign *= -1;
		newIndex += chgSign * i;
		arr[newIndex] = v[num-i-1];
	}
	
	for(int i=0; i<num; i++) {
		cout << arr[i] << " ";
	}
	
	return 0;
}
