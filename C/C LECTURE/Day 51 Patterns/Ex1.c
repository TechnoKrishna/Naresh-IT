#include <stdio.h>
#include <conio.h>

int main() {

    int a, b, n = 50, rev, r, c=0;

    a=n;

    for(a = 1; a <= n; a++)
    {
        rev = 0;
        for(b = a; b != 0; b /= 10)
        {
            r = b % 10;
            rev = rev*10+r;
        }
        if(a==rev)
            printf("%4d", a, c++);
    }
        printf("\n%d palindromes", c);

    return 0;
}