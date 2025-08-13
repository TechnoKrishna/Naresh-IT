#include <stdio.h>
#include <conio.h>
#include <math.h>

int main() {

    float a, b;

    printf("Enter a, b values ");
    scanf("%f %f", &a, &b);

    printf("Sum = %.2f\n", a + b);
    printf("Sub = %.2f\n", a - b);
    printf("Mul = %.2f\n", a * b);
    printf("Mod = %.2f\n", fmod(a, b));
    printf("Div = %.2f\n", (float) a / b);

    return 0;
}