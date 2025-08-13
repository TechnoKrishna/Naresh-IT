#include <stdio.h>
#include <conio.h>

int main() {

    // Read temp in Celsius and find Fahrenheit:

    float C, F;

    printf("Enter Celsius : ");
    scanf("%f", &C);

    F = C * 1.8 + 32;

    printf("Fahrenheit of %.1f%c Celsius is %.1f%c", C,248, F, 248);

    return 0;
}