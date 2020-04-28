// C++ program to compute factorial of big numbers
#include<iostream>
#include <string>

using namespace std;

// Maximum number of digits in output
#define MAX 200000

// This function multiplies x with the number represented by res[].
// res_size is size of res[] or number of digits in the number represented
// by res[]. This function uses simple school mathematics for multiplication.
// This function may value of res_size and returns the new value of res_size
int multiply(int x, int res[], int res_size)
{
    int carry = 0;  // Initialize carry

    // One by one multiply n with individual digits of res[]
    for (int i=0; i<res_size; i++)
    {
        int prod = res[i] * x + carry;
        res[i] = prod % 10;  // Store last digit of 'prod' in res[]
        carry  = prod/10;    // Put rest in carry
    }

    // Put carry in res and increase result size
    while (carry)
    {
        res[res_size] = carry%10;
        carry = carry/10;
        res_size++;
    }
    return res_size;
}

// This function finds factorial of large numbers and prints them
string factorial(int n)
{
    int res[MAX];
    string ret;

    // Initialize result
    res[0] = 1;
    int res_size = 1;

    // Apply simple factorial formula n! = 1 * 2 * 3 * 4...*n
    for (int x=2; x<=n; x++)
        res_size = multiply(x, res, res_size);

    for (int i=res_size-1; i>=0; i--)
        ret+=to_string(res[i]);

    return ret;

}

// Driver program
int main()
{
    cout<<factorial(stoi(factorial(9)));
    return 0;
}

