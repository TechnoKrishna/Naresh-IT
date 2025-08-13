#include <stdio.h>
#include <conio.h>

int main() {

    int n;

    long int cube;

    printf("Enter a NO : ");
    scanf("%d", &n);

    cube = (long) n*n*n;

    printf("%d cube is %i", n, cube);

    return 0;
}