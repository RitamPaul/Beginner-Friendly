#include <bits/stdc++.h>
using namespace std;

// Define a Node class to represent individual elements in the stack
class Node
{
public:
    int data;
    Node *link;

    Node(int n)
    {
        this->data = n;
        this->link = NULL;
    }
};

// Define a Stack class for stack operations
class Stack
{
    Node *top;

public:
    Stack()
    {
        top = NULL;
    }

    // Function to push an element onto the stack
    void push(int data)
    {
        Node *temp = new Node(data);

        if (!temp)
        {
            cout << "Stack Overflow!" << endl;
            exit(1);
        }

        temp->data = data;
        temp->link = top;
        top = temp;
    }

    // Function to check if the stack is empty
    bool isEmpty()
    {
        return top == NULL;
    }

    // Function to pop the top element from the stack
    void pop()
    {
        Node *temp;

        if (top == NULL)
        {
            cout << "No elements to POP" << endl;
            exit(1);
        }
        else
        {
            temp = top;
            top = top->link;
            free(temp);
        }
    }

    // Function to get the length of the stack
    void length()
    {
        int count = 0;
        Node *temp;
        temp = top;
        while (temp != NULL)
        {
            count++;
            temp = temp->link;
        }
        cout << count << endl;
    }

    // Function to display the elements in the stack
    void display()
    {
        Node *temp;

        if (top == NULL)
        {
            cout << "No elements to display" << endl;
            exit(1);
        }
        else
        {
            temp = top;
            while (temp != NULL)
            {
                cout << temp->data;

                temp = temp->link;
                if (temp != NULL)
                {
                    cout << " -> ";
                }
            }
        }
    }
};

int main()
{
    Stack s;

    // Push some elements onto the stack
    s.push(1);
    s.push(2);
    s.push(3);
    s.push(4);

    // Display the elements in the stack
    s.display();
    cout << endl;

    // Get the length of the stack
    s.length();

    // Pop two elements from the stack
    s.pop();
    s.pop();

    // Display the updated elements in the stack
    s.display();

    return 0;
}

/* Output:  4 -> 3 -> 2 -> 1
            4
            2 -> 1
*/

/*
******************  Explanation:  *****************

1. The program defines a Stack class that implements basic stack operations using a linked list.

2. It also defines a Node class to represent individual elements in the stack.

3. In the main function:
    -> It creates an instance of the Stack class named s.
    -> Pushes four elements (1, 2, 3, and 4) onto the stack using the push method.
    -> Displays the elements in the stack, showing "4 -> 3 -> 2 -> 1".
    -> Retrieves and prints the length of the stack, which is 4.
    -> Pops two elements from the stack using the pop method.
    -> Displays the updated elements in the stack, showing "2 -> 1".

*/
