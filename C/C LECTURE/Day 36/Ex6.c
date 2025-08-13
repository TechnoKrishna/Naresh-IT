#include <stdio.h>
#include <conio.h>

int main() {

    int n;

    long int cube;

    printf("Enter a NO : ");
    scanf("%d", &n);

    printf("%d cube is %i", n, (long)n*n*n); // Explicit Type Casting

    return 0;
}