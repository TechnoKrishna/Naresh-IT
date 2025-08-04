#include <stdio.h>
#include <conio.h>

int main() {



    int a = 123;

    int reverse = 0;

    reverse = 123 % 10;

    a = a / 10;

    reverse = (reverse*10) + a % 10;

    a = a / 10;

    reverse = (reverse*10) + a % 10;

    printf("%d", reverse);
    
    return 0;
}