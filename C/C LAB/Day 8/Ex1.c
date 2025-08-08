#include <stdio.h>
#include <conio.h>

int main() {

    float units;

    printf("Enter Units : ");

    scanf("%f", &units);

    (units <= 100) ? printf("%.2f", units*3) : (units > 100) ? printf("%.2f", 300.00 + (units - 100) *4.50) : printf("INVALID");

    return 0;
}