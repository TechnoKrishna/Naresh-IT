#include <stdio.h>
#include <conio.h>

int main() {

    // Fahrenheit to Celsius:

    float C, F;

    printf("Enter Fahrenheit : ");
    scanf("%f", &F);

    C = (F - 32) * 5/9;

    printf("Celsius of %.1f%c Hahrenheit is %.1f%c", F,248, C, 248);

    return 0;
}