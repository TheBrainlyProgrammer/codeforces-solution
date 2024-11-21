#include <iostream>
using namespace std;

int main()
{
    int n, k;
    cin >> n >> k;

    while (k > n)
    {
        cin >> k;
    }

    int a[n];
    for (int i = 0; i < n; i++)
    {
        cin >> a[i];
    }

    // Sort the array in non-increasing order using bubble sort
    for (int i = 0; i < n - 1; i++)
    {
        for (int j = 0; j < n - i - 1; j++)
        {
            if (a[j] < a[j + 1])
            {
                int t = a[j];
                a[j] = a[j + 1];
                a[j + 1] = t;
            }
        }
    }

    int i = 0, c = 0;
    while (i < n && a[i] >= a[k - 1])
    {
        if (a[i] > 0)
        {
            c++;
        }
        i++;
    }

    cout << c << endl;

    return 0;
}