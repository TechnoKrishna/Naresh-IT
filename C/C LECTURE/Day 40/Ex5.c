#include <stdio.h>
#include <conio.h>

int main() {

    float a = 1.5;
    double b = 1.5;

    printf("%.10f, %.101f\n", a, b);
    a = 1.0, b = 1.0;
    printf("%.10f, %.101f\n", a, b);
    a = 1.1, b = 1.1;
    printf("%.10f, %.101f\n", a, b);
    a = 1.2, b = 1.2;
    printf("%.10f, %.101f\n", a, b);

    return 0;
}