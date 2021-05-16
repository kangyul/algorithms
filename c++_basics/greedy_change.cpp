#include <iostream>

using namespace std;

int main()
{
    int change = 0;
    int cnt=0;
    cin >> change;

    change = 1000 - change;

    int coin[6] = {500, 100, 50, 10, 5, 1};

    for(int i=0; i<6; i++) {
        while(change >= coin[i]) {
            change -= coin[i];
        }
    }

    return 0;
}
