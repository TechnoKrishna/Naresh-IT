#include <stdio.h>
#include <conio.h>

int main() {

    long m, n, rev = 0;

    printf("Enter a No : ");
    scanf("%ld", &n);
    m=n;

    while(n!=0)
    {
        int r = n%10;
        rev = rev * 10 + r;
        n /= 10;
    }

    puts(m==rev ? "Palindrome" : "Not a Palindrome");

    return 0;
}