#include <stdio.h>
#include <conio.h>

int main() {

    long n;
    int c = 0;

    printf("Enter a No : ");
    scanf("%ld", &n);

    if(n==0) c++;
    do
    {
        c++;
        n/=10;
    } while (n);

    printf("%d digits no", c);

    return 0;
}