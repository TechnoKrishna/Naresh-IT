#include <stdio.h>
#include <conio.h>

// Finding min in 2 no’s:

int main() {

    int a, b;

    printf("Enter a, b Values : ");
    scanf("%d %d", &a, &b);

    puts( a < b ? "a is small" : "b is small");

    puts( a < b ? "a is small" : b < a ?  "b is small" : "BOTH ARE EQUAL");

    return 0;
}