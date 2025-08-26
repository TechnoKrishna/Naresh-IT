#include <stdio.h>
#include <conio.h>

int main() {

    long n;

    printf("Enter a No : ");
    scanf("%ld", &n);
    printf("Last digit = %d\n", n%10);
    while(n > 9 || n <-9)
    n /= 10;

    printf("First digit = %d", n);

    return 0;
}