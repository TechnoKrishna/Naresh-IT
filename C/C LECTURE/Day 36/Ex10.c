#include <stdio.h>
#include <conio.h>

int main() {

    int a, b;

    printf("Enter a, b values ");
    scanf("%d %d", &a, &b);

    printf("Sum = %d\n", a + b);
    printf("Sub = %d\n", a - b);
    printf("Mul = %d\n", a * b);
    printf("Mod = %d\n", a % b);
    printf("Div = %.2f\n", (float) a / b);

    return 0;
}