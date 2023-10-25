#include <bits/stdc++.h>
using namespace std;

#define MAX 5

class Stack
{
    int stack[MAX];
    int top = -1;

public:
    int a[MAX];

    Stack() { top = -1; }

    // Function to push an element onto the stack
    bool push(int x)
    {
        if (top >= (MAX - 1))
        {
            cout << "Stack overflow" << endl;
            return false;
        }
        else
        {
            a[++top] = x;
            cout << x << " pushed" << endl;
            return true;
        }
    }

    // Function to pop an element from the stack
    int pop()
    {
        if (top < 0)
        {
            cout << "Stack is empty" << endl;
            return 0;
        }
        else
        {
            int x = a[top--];
            cout << x << " popped" << endl;
            return x;
        }
    }

    // Function to get the top element of the stack without removing it
    int peek()
    {
        if (top < 0)
        {
            cout << "Stack is empty" << endl;
            return 0;
        }
        else
        {
            int x = a[top];
            return x;
        }
    }

    // Function to check if the stack is empty
    bool isEmpty()
    {
        return (top < 0);
    }
};

int main()
{
    Stack s;

    s.push(0);
    s.push(1);
    s.push(2);
    cout << s.pop() << " popped" << endl;

    cout << "Top element is: " << s.peek() << endl;

    cout << "Elements in the stack: ";
    while (!s.isEmpty())
    {
        cout << s.peek() << " ";
        s.pop();
    }

    return 0;
}

/* Output:  0 pushed
            1 pushed 
            2 pushed 
            2 popped
            Top element is : 1 
            Elements in the stack : 1 0
*/

/*
******************  Explanation:  *****************

1. The program defines a Stack class that provides basic stack operations such as push, pop, peek, and checking if the stack is empty.

2. It initializes an instance of the Stack class named s.

3. It pushes the values 0, 1, and 2 onto the stack and prints a message for each push operation.

4. It pops the top element (2) from the stack and prints a message indicating the pop operation.

5. It then prints the top element of the stack without removing it, which is 1.

6. Finally, it prints the elements in the stack by repeatedly popping and printing them until the stack is empty. The elements are printed in the reverse order of insertion.

*/
