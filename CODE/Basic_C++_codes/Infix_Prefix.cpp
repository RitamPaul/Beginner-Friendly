#include <bits/stdc++.h>
using namespace std;

// Function to determine the precedence of operators
int prec(char c)
{
    if (c == '^')
        return 3;
    else if (c == '/' || c == '*')
        return 2;
    else if (c == '+' || c == '-')
        return 1;
    else
        return -1; // For other characters or invalid operators
}

// Function to convert an infix expression to a postfix expression
void infixToPostfix(string s)
{
    stack<char> st;
    string res;

    for (int i = 0; i < s.length(); i++)
    {
        char c = s[i];

        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))
        {
            // If the character is an operand, add it to the result
            res += c;
        }
        else if (c == '(')
        {
            // If it's an opening parenthesis, push it onto the stack
            st.push('(');
        }
        else if (c == ')')
        {
            // If it's a closing parenthesis, pop and add operators from the stack to the result
            while (!st.empty() && st.top() != '(')
            {
                res += st.top();
                st.pop();
            }
            st.pop(); // Pop the opening parenthesis
        }
        else
        {
            // If it's an operator, pop and add operators with higher or equal precedence from the stack
            while (!st.empty() && prec(s[i]) <= prec(st.top()))
            {
                res += st.top();
                st.pop();
            }
            st.push(c); // Push the current operator onto the stack
        }
    }

    // Pop any remaining operators from the stack and add them to the result
    while (!st.empty())
    {
        res += st.top();
        st.pop();
    }

    cout << res << endl;
}

int main()
{
    string s = "a+b*(c^d-e)^(f+g*h)-i";

    // Call the infixToPostfix function to convert the infix expression to postfix
    infixToPostfix(s);

    return 0;
}

// Output: abcd^e-fgh*+^*+i-

/*
********************  Explanation:  *********************

1.The program starts with the input infix expression s.

2.The infixToPostfix function is used to convert the infix expression to postfix notation.

3.It iterates through each character in the input expression and processes operands, parentheses, and operators according to the rules of infix to postfix conversion.

4.The resulting postfix expression is "abcd^e-fgh*+^*+i-", which is printed to the console.

*/
