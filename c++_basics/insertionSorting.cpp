#include <iostream>
#include <vector>

using namespace std;

int main(void) 
{
    vector<int> arr = {8, 7, 6, 2, 3, 4, 1};

    int temp=0;

    for(int i=1; i<arr.size(); i++) {
        for(int j=i; j>0; j--) {
            if(arr[j] < arr[j-1]) {
                temp = arr[j];
                arr[j]= arr[j-1];
                arr[j-1] = temp;
            }
        }
    }

    for(int i=0; i<arr.size(); i++) {
        cout << arr[i] << " ";
    }

    return 0;
}
