#include <iostream>
using namespace std;

int main()
{
    float a, b;
    cout << "Enter value for a and b" << endl;
    cin >> a >> b;

    char op;
    cout << "Choose the operation" << endl;
    cin >> op;

    switch (op)
    {
    case '+':
        cout << "Addition result " << (a + b) << endl;
        break;
    case '-':
        cout << "Subtraction result " << (a - b) << endl;
        break;
    case '*':
        cout << "Multiplication result " << (a * b) << endl;
        break;
    case '/':
        cout << "Division result " << (a / b) << endl;
        break;
    default:
        cout << "Invalid operation" << endl;
        break;
    }
    return 0;
}