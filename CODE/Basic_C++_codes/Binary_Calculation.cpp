#include <bits/stdc++.h>
using namespace std;

// Function to perform binary calculations based on the input string
void binary_calculation(string s)
{
    int calc;

    // Initialize 'calc' with the first character in the string 's'
    calc = s[0];

    // Loop through the string 's'
    for (int i = 0; i < s.length(); i++)
    {
        // Check the current character in 's'
        if (s[i] == 'A')
        {
            // If 'A', perform a bitwise AND operation with the next character
            calc = calc & s[i + 1];
        }
        else if (s[i] == 'B')
        {
            // If 'B', perform a bitwise OR operation with the next character
            calc = calc | s[i + 1];
        }
        else if (s[i] == 'C')
        {
            // If 'C', perform a bitwise XOR operation with the next character
            calc = calc ^ s[i + 1];
        }
    }

    // Output the result of the binary calculation
    cout << calc << endl;
}

int main()
{

    // Input string
    string s = "1C0C1C1A0B1";

    // Call the binary_calculation function with the input string
    binary_calculation(s);

    return 0;
}

// Output : 49

/*
********************  Explanation:  *********************

1.The program starts with the input string s as "1C0C1C1A0B1".

2.In the binary_calculation function, it initializes calc with the first character, which is '1'.

3.The function then iterates through the string s character by character.

4.When it encounters 'C', it performs a bitwise XOR operation with the next character, so '1' ^ '0' results in '1'.

5.When it encounters 'C' again, it performs a bitwise XOR operation with the next character, so '1' ^ '1' results in '0'.

6.When it encounters 'A', it performs a bitwise AND operation with the next character, so '0' & '0' results in '0'.

7.Finally, when it encounters 'B', it performs a bitwise OR operation with the next character, so '0' | '1' results in '1'.

8.The result, '1', is then printed to the console.

So, the output of the code is '1'.

*/
