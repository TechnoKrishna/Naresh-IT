#include <stdio.h>
#include <conio.h>

int main() {

    int a = 10, b = 200, c = 134;

   (a>b && a>c) && printf("A is Greater") || (b>a && b>c) && printf("B is Greater") || (c>b && c>a) && printf("c is Greater"); // USING SHORT CIRCUIT

   printf("\n\n");

    (a>b && a>c) ? printf("A is greater") : (b>c && b>a) ? printf("B is greater") : printf("C is greater");

    return 0;
}