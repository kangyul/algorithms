#include <iostream>
#include <string>

using std::cout;

int main() 
{
    std::string greeting = "Hello";
    greeting.append(" there!");
    greeting.insert(3, "     ");
    greeting.erase(3, 1); 
    greeting.erase(3);
    greeting.erase(greeting.length() - 1);
    greeting.pop_back();
    greeting.replace(0, 1, "Y");

    cout << greeting << std::endl;

    return 0;
}
