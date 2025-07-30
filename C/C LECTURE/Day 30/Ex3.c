#include <stdio.h>
#include <conio.h>

// Finding +Ve / -Ve / Zero using ternary operator?

int main() {

    int n;

    printf("Enter a No : ");
    scanf("%d", &n);

    puts( n>0 ? "+Ve" : n < 0 ? "-Ve" : "Zero");

    return 0;
}