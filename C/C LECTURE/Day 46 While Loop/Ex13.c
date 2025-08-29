#include <stdio.h>
#include <conio.h>
#include <math.h>

int main() {

    int b, p, s = 0;

    printf("Enter base, power values ");
    scanf("%d %d", &b, &p);

    while (p >= 1)
    {
        s += pow(b, p);
        p--;
    }
    
    printf("Power Sum=%d", s);

    return 0;
}