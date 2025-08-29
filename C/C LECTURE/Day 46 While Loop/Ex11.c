#include <stdio.h>
#include <conio.h>

int main() {

    int b, p, t;
    long pwr = 1;

    printf("Enter base, power values ");
    scanf("%d %d", &b, &p);

    if(p < 0) t = p, p =-p;

    while (p >= 1)
    {
        pwr = pwr * b;
        p--;
    }

    if(t < 0) printf("Power=%.3f", 1.0/pwr);
    else printf("Power=%ld", pwr);

    return 0;
}