#include <stdio.h>
#include <conio.h>

int main() {

    long n, cube;

    printf("Enter a NO : ");
    scanf("%d", &n);

    cube = n*n*n;

    printf("%d cube is %i", n, cube);

    return 0;
}