#include <stdio.h>
#include <conio.h>

int main() {

    const float pi = 3.14;
    float r, area, cf;

    printf("Enter Circle Radius : ");
    scanf("%f", &r);

    area = pi * r * r;

    cf = 2 * pi * r;

    printf("Area = %.2f, CF = %.2f", area, cf);

    return 0;
}