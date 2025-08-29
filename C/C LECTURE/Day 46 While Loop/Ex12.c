#include <stdio.h>
#include <conio.h>

int main() {

    int b, p, s = 0;
    long pwr = 1;

    printf("Enter base, power values ");
    scanf("%d %d", &b, &p);

    while (p >= 1)
    {
        pwr = pwr * b;
        s += pwr;
        p--;
    }
    
    printf("Power Sum=%d", s);

    return 0;
}