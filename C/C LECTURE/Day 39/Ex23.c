#include <stdio.h>
#include <conio.h>

int main() {

    long n;

    printf("Enter the Amount ");
    scanf("%ld", &n);

    if(n / 500 != 0)
    printf("%d - 500/- \n", n / 500); n = n % 500;

    if(n / 200 != 0)
    printf("%d - 200/- \n", n / 200); n = n % 200;

    if(n / 100 != 0)
    printf("%d - 100/- \n", n / 100); n = n % 100;

    if(n / 50 != 0)
    printf("%d - 50/- \n", n / 50); n = n % 50;

    if(n / 20 != 0)
    printf("%d - 20/- \n", n / 20); n = n % 20;

    if(n / 10 != 0)
    printf("%d - 10/- \n", n / 10); n = n % 10;

    if(n / 5 != 0)
    printf("%d - 5/- \n", n / 5); n = n % 5;

    if(n / 1 != 0)
    printf("%d - 1/- \n", n / 1); n = n % 1;


    return 0;
}