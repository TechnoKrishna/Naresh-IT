#include <stdio.h>
#include <conio.h>

int main() {

    int n, cube;

    printf("Enter a No : ");
    scanf("%d", &n);

    cube = n*n*n;

    printf("%d cube is %d", n, cube);

    return 0;
}