#include <iostream>
#include <stack>
#include <vector>

using namespace std;

stack<int> st;
stack<int> st2;
vector<char> vec;

int main()
{
    int N;
    cin >> N;
    int num=0;

    for(int i=N; i>0; i--) {
        st2.push(i);
    }

    for(int i=0; i<N; i++) {
        int x;
        cin >> x;

        if(i == 0) {
            for(int j=0; j<x; j++) {
                vec.push_back('+');
                num = st2.top();
                st.push(j);
                st2.pop();
            }
            vec.push_back('-');
            continue;
        }

        if(x < st.top()) {
            cout << "NO" << '\n';
            return 0;
        } else if (x == st.top()) {
            vec.push_back('-');
            st.pop();
        } else {
            while (1)
            {
                vec.push_back('+');
                num = st2.top();
                st.push(num);
                st2.pop();

                if(x == st.top()) {
                    vec.push_back('-');
                    st.pop();
                    break;
                }
            }
            
        }
    }

    for(int i=0; i<vec.size(); i++) {
        cout << vec[i] << '\n';
    }

    return 0;
}
