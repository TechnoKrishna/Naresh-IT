#include <stdio.h>
#include <conio.h>

int main() {

    // Find the absolute[Always +Ve] value of given no?

    int n;

    printf("Enter A No : ");
    scanf("%d", &n);

    if (n < 0) n =- n;

    printf("Absolute Value = %d", n);
    
    return 0;
}