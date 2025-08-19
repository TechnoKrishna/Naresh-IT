#include <stdio.h>
#include <conio.h>

int main() {

    int b, p;
    long pwr = 1;

    printf("Enter base, power values ");
    scanf("%d %d", &b, &p);

    while (p >= 1)
    {
        pwr = pwr * b;
        p--;
    }

    printf("Power=%ld", pwr);

    return 0;
}