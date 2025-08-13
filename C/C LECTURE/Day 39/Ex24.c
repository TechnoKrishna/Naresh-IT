#include <stdio.h>
#include <conio.h>

int main() {

    long n;

    printf("Enter the with with Drawl Amount");
    scanf("%ld", &n);

    if(n % 100 == 0)
    printf("Take your Cash %ld", n);

    if(!(n % 100 == 0))
    printf("Amount Should be in 100 Multiples");

    return 0;
}